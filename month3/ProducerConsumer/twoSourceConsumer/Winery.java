package threads.waitNotify;

public class Winery {

    private volatile int rakia = 0;

    public synchronized void putRakia(){
        try {
            while (rakia >= 100){
                wait();
            }
            this.rakia++;
            System.out.println(Thread.currentThread().getName() + " svari  1 rakiika. Obhsto rakii " + rakia);
            if(rakia >= 10){
                notifyAll();
            }
        } catch (InterruptedException e) {
            System.out.println("eh mamo");
        }
    }

    public synchronized void drinkRakia(){
        try {
            while (rakia < 10){
                wait();
            }
            rakia -= 10;
            System.out.println(Thread.currentThread().getName() + " vze 10 litra rakia i gi izpi. V izbata ostanaha " + rakia);
            notifyAll();
        } catch (InterruptedException e) {
            System.out.println("eh mamo");
        }
    }
}