package test3Demo;


import java.time.LocalDate;

//POJO - Plain Old Java Object
//DAO - data access object - ако трябва да записваме, трием, променяме потребители в базата, трябва да има разделение
// на властите именно заради това имаме DAO - грижи се за това нашите обекти да се сериализират. За всяко едно POJO е хубаво да си има едно DAO
public class User {

    private int id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;

    public User( String name, String email, LocalDate dateOfBirth) {

        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
