package shooters;

import bows.Bow;

public abstract class Archer {
    public enum Gender{
        MALE, FEMALE;
    }

    private String name;
    private Gender gender;
    private int age;
    private Bow bow;
    protected int experience;
    private int tournaments;
    private int points = 0;
    protected int misses = 0;
    protected int tens = 0;

    public Archer(String name, Gender gender, int age, Bow bow) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.bow = bow;

    }

    public int getTens() {
        return tens;
    }

    public int getMisses() {
        return misses;
    }

    public int getExperience() {
        return experience;
    }

    public abstract boolean validExperience();

    public Gender getGender() {
        return gender;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName(){
        return name;
    }

    public Bow getBow() {
        return bow;
    }

    public abstract void shoot();
    public void  addOne(){
        tournaments++;
    }

    public abstract int arrowNumber();

    public abstract String getType();
}
