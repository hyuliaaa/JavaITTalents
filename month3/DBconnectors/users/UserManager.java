import java.sql.*;

public class UserManager {

    public void addUser(String fullname,String username,String password){

        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
            // за да вземем ключа трябва да добавим Statement.RETURN_GENERATED_KEYS
            PreparedStatement s = c.prepareStatement("INSERT INTO USERS (fullname,username,password) VALUES (?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            s.setString(1,fullname);
            s.setString(2,username);
            s.setString(3,password);
            s.executeUpdate();
            ResultSet resultSet = s.getGeneratedKeys(); //getGeneratedKeys - връща новогенерираният auto-incremented primary key
            resultSet.next();
            long   newId = resultSet.getInt(1);
            System.out.println("User " + fullname + " added with id: " + newId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
