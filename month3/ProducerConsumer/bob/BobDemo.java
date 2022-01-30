package main.bob;

public class BobDemo {

    public static void main(String[] args) {
        Gurne gurne = new Gurne();

       // Baba baba1 = new Baba(gurne);
        Baba baba2 = new Baba(gurne);
        Baba baba3 = new Baba(gurne);
        Vnuche vnuche1 = new Vnuche(gurne);
        Vnuche vnuche2 = new Vnuche(gurne);
        Vnuche vnuche3 = new Vnuche(gurne);


        vnuche1.start();
        baba2.start();
        vnuche2.start();
        baba3.start();
        vnuche3.start();
    }
}
