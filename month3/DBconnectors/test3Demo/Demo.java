package test3Demo;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Demo {


    public static void main(String[] args) {


        User u = new User("Mimi", "mimi@abv.bg", LocalDate.now().minus(Period.ofYears(22)));
        UserDAO.addUser(u);

//        List<User> users = UserDAO.getAll();
//        if(users.size() != 0){
//            System.out.println("Existing users now: ");
//            users.forEach(u -> System.out.println(u));
//        }
//        else{
//            User u = new User("Ivan", "ivancho@abv.bg", LocalDate.now().minus(Period.ofYears(20)));
//            UserDAO.addUser(u);
//            System.out.println("User added - " + u);
//        }

//        User u = UserDAO.getById(2);
//        u.setEmail("mariikaNewEmail@gmail.com");
//        UserDAO.editUser(u);

        UserDAO.deleteUser(2);


    }

}
