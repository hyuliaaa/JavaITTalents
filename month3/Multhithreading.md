# Multiprogramming 
Multiprogramming is running multiple programs on a single machine.
## Multi-user
Multi-user - more than one user will use the same machine simultaniously
## Multi-Tasking
Multi-tasking - only one user but multiple tasks can run simultaniously.

# MultiThreading In Java
Multithreading can be achieved by - Thread Class or Runnable Interface.   
```Java
import java.util.*;

class Test extends Thread{
    @Override
    public void run() {
        int i = 1;
        while (true){
            System.out.println((i++) + "Hello");
        }
    }
}
class Main {
    public static void main(String[] args) {

        Test t = new Test();
        t.start();

        int i = 1;
        while (true){
            System.out.println((i++) + "World");
        }
    }
}

```

## Examples extending Thread Class & using Runnable Interface

``` Java
public class Horse extends Thread{

    public void gallop(){
        for(int i =1 ; i <= 10; i++){
            System.out.println("Horse gallops for " + i*10);
        }
    }

    @Override
    public void run() {
        gallop();
    }
}
```
```Java
public class Mare implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i <=10; i++){
            System.out.println("Mare is running" + i*10);
        }
    }
}

```
``` Java
import java.io.FileInputStream;
import java.io.FileNotFoundException;



class Main {
    
    public static void main(String[] args) {

        Horse h = new Horse();
        //for interface 
        Thread t = new Thread(new Mare());
        t.start();
        h.start();
    }
}

```
## Anonymous class
``` Java
   Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <=10; i++){
                    System.out.println("Gazelata bqga " + i*10);
                }
            }
        };
        new Thread(r).start();
```
## Lambda
``` Java
        Runnable r = () -> {
            for(int i = 1; i <=10; i++){
                System.out.println("Gazelata bqga " + i*10);
            }
        };
        new Thread(r).start();
```

## States of a Thread
![sh](https://user-images.githubusercontent.com/54545875/148078838-24b8bacd-1787-49d7-a69f-13c012112562.png) 
<br> </br>
When we create an object of a thread in will be in new state. If we want to run it, we have to call
the start method. When we call start method our object will run into ready state, it means it is ready to run.
Start will call run method and it will be in running state.  
After running and completing its task, the thread
will enter into terminated state by itself. If a thread has started and ended we cannot restart it again. We need a new thread.
While running it may enter into wait state, it means it is waiting for some resource or it is made to 
wait by some other thread.   
When a thread is running and we want that thread to delay for some time by using sleep and we go to timed wait state
And when the thread wakes up it will go to running state. We also have blocked state.


### Two threads accessing a single file
If we have a file and we have two threads that access this file, we should not allow both threads to access 
the same file at the same time. If one thread is accessing, the other should wait. If one thread finishes
it should inform the other that is waiting that the first one has finished work. Think of printers and people
that use them as a good example.
