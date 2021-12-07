public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name +"(" + age + ")";
    }


    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }
//    @Override
//    public int compareTo(Person o) {
//        Integer i1 = this.getAge();
//        Integer i2 = o.getAge();
//
//        return i1.compareTo(i2);
//    }
}
/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class ArrayListExamples {

    public static void main(String[] args) {
         
        //Когато използваме дефинирани от нас класове, трябда да override compareTo метода, за да можем да сравняваме елемените по някакъв начин.

        TreeSet<Person> set = new TreeSet<>();
        //TreeSet<Person> set = new TreeSet<>((o1, o2) -> o1.getAge()-o2.getAge()); ->можем да подаваме компаратор директно в скобите тогава не тр да имплементираме 
        //Comparable interface
        //  TreeSet<Person> set = new TreeSet<>(Comparator.comparingInt(Person::getAge));
        Person p1 = new Person("Zendaya",20);
        Person p2 = new Person("Alena",22);
        Person p3 = new Person("Magdalena",23);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);

    }
}
