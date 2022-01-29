package countries;

public class Country {

    private int country_id;
    private String countryName;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_id=" + country_id +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
