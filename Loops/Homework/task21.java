import java.util.Scanner;


public class task21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Въведете число в интервала [1..52]");
        int card = sc.nextInt();


        while (card < 1 || card > 52) {
            System.out.println("Числото, което въведохте е извън интервала. Опитайте отново: ");
            card = sc.nextInt();
        }

        int typeOfCard;
        int suit; //боя на картата : спатия, каро, купа, пика

        for (int i = card; i <= 52; i++) {

            if (i % 4 == 0) {
                typeOfCard = (i / 4) - 1;
            }
            else {
                typeOfCard = i / 4;
            }

            suit = (i % 4);

            switch (typeOfCard) {
                case 0:
                    System.out.print("Двойка");
                    break;
                case 1:
                    System.out.print("Тройка");
                    break;
                case 2:
                    System.out.print("Четворка");
                    break;
                case 3:
                    System.out.print("Петица");
                    break;
                case 4:
                    System.out.print("Шестица");
                    break;
                case 5:
                    System.out.print("Седмица");
                    break;
                case 6:
                    System.out.print("Осмица");
                    break;
                case 7:
                    System.out.print("Деветка");
                    break;
                case 8:
                    System.out.print("Десетка");
                    break;
                case 9:
                    System.out.print("Вале");
                    break;
                case 10:
                    System.out.print("Дама");
                    break;
                case 11:
                    System.out.print("Поп");
                    break;
                case 12:
                    System.out.print("Асо");
                    break;

            }

            System.out.print(" ");

            switch (suit) {
                case 0:
                    if (i == 52) {
                        System.out.print("пика");
                    }
                    else {
                        System.out.print("пика, ");
                    }
                    break;
                case 1:
                    System.out.print("спатия, ");
                    break;
                case 2:
                    System.out.print("каро, ");
                    break;
                case 3:
                    System.out.print("купа, ");
                    break;

            }


        }


    }

}
