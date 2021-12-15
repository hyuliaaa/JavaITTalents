package main.immigrants;

public class ExtremistImigrant extends RadicalAndExtreme {

    public ExtremistImigrant(String name,double money) {
        super(name,money);

    }

    @Override
    public boolean validatePassport() {
        return false;
    }

    public void boom(){
        System.out.println("The city is bombarded!");
        this.getCurrentCountry().getCities().remove(getCurrentCity());
    }
}
