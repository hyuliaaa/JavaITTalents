# Exceptions
Exeption is a problem that arises during the execution of a program. When exception occurrs the normal flow of the program is disrupted.
## Unchecked & Checked Exceptions
### Unchecked Exceptions
Unchecked Exceptions are exceptions that are cauth in run-time of the program. If we want we can catch them, if we don't want our program will blow up.  

```Java
class Main {
    static void a() {
        int result = 5 / 0;
    }

    static void b() {
        a();
    }

    static void c() {
        b();
    }

    public static void main(String[] args) {
        c();

    }
}

```
This code below compiles successfuly but when executed it gives the following exception:  
```diff
- Exception in thread "main" java.lang.ArithmeticException: / by zero
-	at Main.a(Main.java:3)
-	at Main.b(Main.java:7)
-	at Main.c(Main.java:11)
-	at Main.main(Main.java:15)
@@ Process finished with exit code 1 @@
```
This means that the exception occurred in row 3, fun a is called by b at 7 on so on..  
With try - catch block :

``` Java 
class Main {
    static void a() {
        try {
            int result = 5 / 0;
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    static void b() {
        a();
        System.out.println("Byee..");
    }

    static void c() {
        b();
    }

    public static void main(String[] args) {
        c();

    }
}

```

s.o.u.t.(e) -> prints java.lang.ArithmeticException: / by zero      Byee..  
s.o.u.t (e.getMessage()) -> prints / by zero      Byee..

### Checked Exceptions
A checked exception is an exception that is checked by the compiler at compile-time. Java compiler forces us to write try-catch block with these exceptions or mark them with throws.
We must handle them, otherwise our program will not compile.

``` Java
import java.io.FileInputStream;

class Main {
    static void a() {
        FileInputStream f = new FileInputStream("New file");


    }

    static void b() {
        a();
        System.out.println("Byee..");
    }

    static void c() {
        b();
    }

    public static void main(String[] args) {
        c();

    }
}

```

Here, the line with FileInputStream will be underlined because there may occur an exception so we have to surround our statement with try - catch block or add throws in the method signature.
``` Java
  static void a() {
        try {
            FileInputStream f = new FileInputStream("New file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
```
``` Java
  static void a() throws FileNotFoundException {
        FileInputStream f = new FileInputStream("New file");
    }
```

### User - defined Exceptions
User defined exceptions are also checked exceptions. So they are handled the same way as all checked exceptions.
``` Java
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class LowBalanceException extends Exception{
    @Override
    public String toString() {
        return "Balance should not be less than 3000";
    }
}

class Main {
    static void a()  {
        try {
            throw new LowBalanceException();
        } catch (LowBalanceException e) {
            e.printStackTrace();
        }
    }

    static void b() {
        a();
        System.out.println("Byee..");
    }

    static void c() {
        b();
    }

    public static void main(String[] args) {
        c();

    }
}

```

## Throw & throws
``` Java
import java.io.FileInputStream;
import java.io.FileNotFoundException;


class Main {



    static void meth1(){
        int a = 0;
        try {
            a = area(-5,10);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(a);
    }

    private static int area(int a, int b) throws Exception {
        if(a < 0 || b < 0){
            throw new Exception("a or b is negative number");
        }

        int area = a * b;
        return area;

    }

    public static void main(String[] args) {
        meth1();
    }
}

```

With custom exception class:
``` Java
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class NegativeDimensionException extends Exception{
    @Override
    public String toString() {
        return "Negative dimension given";
    }
}

class Main {



    static void meth1(){
        int a = 0;
        try {
            a = area(-5,10);
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        }

        System.out.println(a);
    }

    private static int area(int a, int b) throws NegativeDimensionException {
        if(a < 0 || b < 0){
            throw new NegativeDimensionException();
        }

        int area = a * b;
        return area;

    }

    public static void main(String[] args) {
        meth1();
    }
}

```

