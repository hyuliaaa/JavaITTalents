package test3Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager { // with DB manager we create the connection

    private static DBManager instance;
    private Connection connection;
    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "hr";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root";

    public static DBManager getInstance() {
        if(instance==null){
            instance = new  DBManager();
        }
        return instance;
    }



    private DBManager(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME,DB_USER,DB_PASS);

            System.out.println("Here at c");
        } catch (SQLException e) {
            System.out.println("Error creating connection - " + e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public Connection getConnection() {
        return connection;
    }
}
