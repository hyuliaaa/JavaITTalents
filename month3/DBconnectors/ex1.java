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


            Statement s = c.createStatement();
           // s.execute("SELECT * FROM EMPLOYEES"); //returns boolean, inserts the result in the statement and from the statement we can say: s.getResultSet()
            // ResultSet is like a collection which contains the rows returned from the query
            ResultSet resultSet =s.executeQuery("SELECT * FROM users"); //like a shorcut
            while (resultSet.next()){
                int id = resultSet.getInt("user_id");
                String name = resultSet.getString("username");
                System.out.println(id+ " - "+ name) ;
            }

            //s.executeUpdate(""); //returns the number f rows we have affected - >update, insert delete

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


        
        //this code is cool if we don't want to insert, update or alter anything
        
    }
}
