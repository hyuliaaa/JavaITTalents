# Lambda Expressions
Lambda expressions are used for defining **anonymous(nameless)** methods. Lambda expressins are defined with the help of interfaces. If an interface is having just 
one abstact method it is called as **functional interface**.
``` Java
@FunctionalInterface
interface MyLambda{
  void display();
}

public class Demo{
  public static void main(String[] args){
   MyLambda m = () -> {System.out.println("Hello");};
   m.display();
  }
}
```
() are reffering to the display method only, because there is no argumets, that is why the brackets are empty.

## Parameters in Lambda expression
``` Java
@FunctionalInterface
interface MyLambda{
  int add(int a, int b);
}

public class Demo{
  public static void main(String[] args){
   MyLambda m = (a,b) -> {return a+b;};
   //MyLambda m = (a,b) -> a+b;  alternative
   {System.out.println(m.add(20,30);
  }
}
``` 
