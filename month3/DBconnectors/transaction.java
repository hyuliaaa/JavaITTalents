
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoPayments {

    public static void main(String[] args) {

        // Maria needs to pay 200 lv to Hyulia

        Connection c= null;
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
            c.setAutoCommit(false); //means that statements won't be executed now, but will wait for c.commit()
            PreparedStatement s = c.prepareStatement("UPDATE people SET money = money -200 where id = 2");
            s.executeUpdate(); //rows 16 and 17 are counted usually as one atomic operation


            //here if we make make mistake to the sql statement, maria will give money, but hyulia won't get them
            //so maria's money will be lost
            //the solution is to make both queries as a transaction - so if one throws error the other one won't execute.
            //by using transactions we make both statements as 1 atomic operation
            s = c.prepareStatement("UPDATE people SET money = money + 200 where id = 1");
            s.executeUpdate();
            c.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                c.rollback(); // if any exception occurs we will leave the execution of both statements and return
                //to the state before them
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        finally {
            try {
                c.setAutoCommit(true)   ;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        System.out.println("DOne");
    }
}
