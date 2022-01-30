package main.bob;

public class Gurne {

    private volatile int bob = 0;

    public synchronized void sipiBob() throws InterruptedException {
        while (bob >= 100 ){
            wait();
        }
        bob++;
        notifyAll();
        System.out.println("Slaga bob, bob is: " + bob);
    }

    public synchronized void vzemiBob() throws InterruptedException {
        while(bob <= 0){
            wait();
        }
        bob--;
        notifyAll();
        System.out.println("Vzima bob, bob is: " + bob);
    }

}
