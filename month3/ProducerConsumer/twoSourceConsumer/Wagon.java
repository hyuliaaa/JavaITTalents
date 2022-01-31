package threads.waitNotify;

public class Wagon {

    private volatile int grapesKg = 0;

    public synchronized void putGrapes(int grapes){
        try {
            while (grapesKg + grapes > 60){
                wait();
            }
            this.grapesKg+=grapes;
            System.out.println(Thread.currentThread().getName() + " nabra " + grapes + " grozde. Obhsto ima " + grapesKg);
            if(grapesKg >= 10){
                notifyAll();
            }
        } catch (InterruptedException e) {
            System.out.println("eh mamo");
        }
    }

    public synchronized void getGrapes(){
        try {
            while (grapesKg < 10){
                wait();
            }
            grapesKg -= 10;
            System.out.println(Thread.currentThread().getName() + " vze 10 kila grozde i pochva da vari rakia. V karucata ostanaha " + grapesKg);
            notifyAll();
        } catch (InterruptedException e) {
            System.out.println("eh mamo");
        }
    }
}
