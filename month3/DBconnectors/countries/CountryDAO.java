package countries;

import test3Demo.DBManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CountryDAO {
    //create table


    public static void createTable(){
        Connection c = DBManager.getInstance().getConnection();
        try {
            PreparedStatement preparedStatement = c.prepareStatement
                    ("CREATE TABLE Countries(country_id int auto_increment, primary key (country_id),country_name varchar(50))");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    //insert a new country
    public static void insertCountry(Country c){
        Connection connection = DBManager.getInstance().getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO countries (country_name) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,c.getCountryName());
            preparedStatement.executeUpdate();
            ResultSet set = preparedStatement.getGeneratedKeys();
            set.next();
            int id = (int) set.getLong(1);
            c.setCountry_id(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //list all countries

    public static List<Country> getAllCountries(){
        List<Country> countries = new ArrayList<>();
        Country country = null;
        Connection c = DBManager.getInstance().getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("SELECT country_id,country_name FROM countries");
            ResultSet set = ps.executeQuery();
            while (set.next()){
                country = new Country(set.getString("country_name"));
                country.setCountry_id(set.getInt("country_id"));
                countries.add(country);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return countries;
    }
    //find country by id
    public static Country findById(int id){
        Connection c = DBManager.getInstance().getConnection();
        Country country = null;
        try {
            PreparedStatement ps = c.prepareStatement("SELECT country_id,country_name FROM countries WHERE country_id = ?");
            ps.setInt(1,id);
            ResultSet set = ps.executeQuery();
            if(set.next()){
                country = new Country(set.getString("country_name"));
                country.setCountry_id(set.getInt("country_id"));
            }else {
                System.out.println("No country in DB");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return country;
    }

    //find country by part of a name
    public static Country findByName(String str){
        Country country = null;
        Connection c = DBManager.getInstance().getConnection();
        try {
            PreparedStatement ps = c.prepareStatement
                    ("SELECT country_id,country_name FROM countries WHERE country_name like CONCAT('%', ?, '%' )");
            ps.setString(1,str);
            ResultSet set = ps.executeQuery();
            if(set.next()){
                country = new Country(set.getString("country_name"));
                country.setCountry_id(set.getInt("country_id"));
            }
            else {
                System.out.println("Country not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return country;
    }
    //drop countries table
    public static void deleteTable(){
        Connection c = DBManager.getInstance().getConnection();
        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement("DROP TABLE countries");
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

