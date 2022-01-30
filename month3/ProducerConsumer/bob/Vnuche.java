package main.bob;

public class Vnuche extends Thread{
    private Gurne gurne;

    Vnuche(Gurne gurne){
        this.gurne = gurne;
    }
    @Override
    public void run() {

        while (true){
            try {
                if(isInterrupted()){
                    break;
                }
                gurne.vzemiBob();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
