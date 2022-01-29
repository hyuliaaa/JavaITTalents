package countries;

import java.util.ArrayList;
import java.util.List;

public class CountriesDemo {
    public static void main(String[] args) {
        //CountryDAO.createTable();
//        Country bulgaria = new Country("Bulgaria");
//        CountryDAO.insertCountry(bulgaria);
//
//        Country greece = new Country("Greece");
//        CountryDAO.insertCountry(greece);
//
//        Country turkey = new Country("Turkey");
//        CountryDAO.insertCountry(turkey);

//        Country c = CountryDAO.findById(3);
//        System.out.println(c.getCountryName());

//        Country country =CountryDAO.findByName("Gre");
//        System.out.println(country.getCountryName());
//        System.out.println(country.getCountry_id());


        List<Country> countries = CountryDAO.getAllCountries();
        if(countries.size()==0){
            System.out.println("No countries");
        }else {
            System.out.println("List of countries: ");
            for (Country country : countries) {
                System.out.println(country);
            }
        }


        CountryDAO.deleteTable();



    }
}
