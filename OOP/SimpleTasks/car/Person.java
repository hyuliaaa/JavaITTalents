import com.sun.source.tree.BreakTree;

public class Person {
    private String name;
    private int age;
    private long personalNumber;
    private double money;
    private double weight;
    boolean isMale;
    Car car;
    private Person[] friends;
    Person(){
        age = 0;
        weight = 4.0;
    }
    Person(String name, long personalNumber, boolean isMale){
      this();
      this.name = name;
      this.personalNumber = personalNumber;
      this.isMale = isMale;
      friends = new Person[3];
    }

    public void buyCar(Car car){
        if(car.getPrice() <= money){
            System.out.println("You bought a new " + car.getModel());
            money -= car.getPrice();
            return;
        }
        System.out.println("You do not have enough money for this car!");
    }

    public double sellCarForScrap(){
        money +=car.calculateCarPriceForScrap(1.2);
        return money;
    }

    public double getMoney(){
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
