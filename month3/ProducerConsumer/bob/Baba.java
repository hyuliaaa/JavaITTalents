package main.bob;

import main.Bank;

public class Baba extends Thread{
    private Gurne gurne;

    Baba(Gurne gurne){
        this.gurne = gurne;
    }

    @Override
    public void run() {
        while (true){
            try {
                if(isInterrupted()){
                    break;
                }
                gurne.sipiBob();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
