import java.util.Scanner;

public class Task4 {

    //1
    //1 2
    //1 2 3
    //..
    //1 2 3 4 5 6 7 8 9

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
//
//        for(int i = 1; i <=e+1; i++){
//            for(int j = 1; j < i; j++){
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }

      //  printR(1,9);

        recPrint(s,e);
    }

    static void recPrint(int s, int e){

        if(s>e){

            return;
        }
        printR(1,s);
        System.out.println();
        recPrint(s+1,e);
    }

    static void printR(int s, int e){
        if(s>e){

            return;
        }

        System.out.print(s + " ");
        printR(s+1,e);
    }
}
