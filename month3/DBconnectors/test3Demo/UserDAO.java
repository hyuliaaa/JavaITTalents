package test3Demo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
// DAO се грижи за това как потребителя да се записва, редактира, изтрива, откъде с какви колони, драйвери и т.н.
// DAO must be singleton

// ппц DAO като design patters са интерфейс, който описва, че ще има addUser, editUser...
// след това се прави database userDAO, който имплементира интергейса и пише заявки в базата
public class UserDAO {



    public static void addUser(User u){
        Connection c = DBManager.getInstance().getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("INSERT INTO users(name,email,date_of_Birth) values (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,u.getName());
            ps.setString(2,u.getEmail());
            ps.setDate(3, Date.valueOf(u.getDateOfBirth()));

            ps.executeUpdate();
            ResultSet resultSet = ps.getGeneratedKeys();
            resultSet.next();
            u.setId((int) resultSet.getLong(1));



        } catch (SQLException e) {
            System.out.println("User adding failed! - "+ e.getMessage());
        }

    }

    public static void editUser(User u){
        Connection c = DBManager.getInstance().getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("UPDATE users SET name=?, email = ?, date_of_birth = ? where id = ?");
            ps.setString(1,u.getName());
            ps.setString(2,u.getEmail());
            ps.setDate(3, Date.valueOf(u.getDateOfBirth()));
            ps.setInt(4,u.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("User editing failed! - "+ e.getMessage());
        }
    }

    public static void deleteUser(int id){
        Connection c = DBManager.getInstance().getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("DELETE FROM users WHERE id = ?");
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static User getById(int id){ //всичко което взимаме от базата го правим в нова инстанция
        User u = null;
        Connection c = DBManager.getInstance().getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("SELECT id,name,email, date_of_birth FROM users where id = ?");
            ps.setInt(1,id);
            ResultSet resultSet = ps.executeQuery();
            if(resultSet.next()){
                u = new User(
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getDate("date_of_birth").toLocalDate()
                );
                u.setId(resultSet.getInt("id"));
            }
            else {
                System.out.println("No user found! ");
            }

        } catch (SQLException e) {
            System.out.println("User editing failed! - "+ e.getMessage());
        }
        return u;
    }

    public static List<User> getAll(){
        List<User> users = new ArrayList<>();
        Connection c = DBManager.getInstance().getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("SELECT id,name,email, date_of_birth FROM users ");
            ResultSet resultSet = ps.executeQuery();
            while(resultSet.next()){
                User u = new User(
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getDate("date_of_birth").toLocalDate()
                );
                u.setId(resultSet.getInt("id"));
                users.add(u);
            }


        } catch (SQLException e) {
            System.out.println("User editing failed! - "+ e.getMessage());
        }
        return users;
    }
}
