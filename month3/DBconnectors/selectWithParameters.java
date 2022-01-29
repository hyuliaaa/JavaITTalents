import java.sql.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println("I am back");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // проверява дали класа на драйвъра е зареден,ако не гърми с exception значи класа го има
            System.out.println("driver here!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("You have to install dependency from here");

        }

        //OPEN CONNECTION
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root"); //create connection, which jdbc and my sql
            //driver manager will see jdbc, will see mysql, and will start searching for mysql driver, and if we
            // dont have mysql, will get no suitable driver found!
            System.out.println("Connection made");

            //? is like a parameter,that is why we have to use prepared statement, it solves -> SQL injections and concatenation of parameters
            PreparedStatement s = c.prepareStatement("SELECT user_id,fullname,username from users where username = ?" );
            s.setString(1,"Maria");
            ResultSet resultSet = s.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt("user_id");
                String name = resultSet.getString("fullname");
                System.out.println(id+ " - "+ name) ;
            }

            //s.executeUpdate(""); //returns the number f rows we have affected - >update, insert delete

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }



       

    }
}
