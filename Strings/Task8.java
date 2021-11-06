import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int counter = 1;
        int j = 1;

        int i =0;
        while(i <str.length() ){

           for(j = i+1; j <str.length();j++){
               if(str.charAt(j-1)==str.charAt(j)){
                    counter++;
               }
               else {
                   break;
               }
           }
           if(str.charAt(i) == '2'){
               if(counter==1){
                   System.out.print("a");
               }
               else if(counter==2){
                   System.out.print("b");
               }
               else if(counter==3){
                   System.out.print("c");
               }
           }
           else if(str.charAt(i) == '3'){
               if(counter==1){
                   System.out.print("d");
               }
               else if(counter==2){
                   System.out.print("e");
               }
               else if(counter==3){
                   System.out.print("f");
               }
           }
           else if(str.charAt(i) == '4'){
               if(counter==1){
                   System.out.print("g");
               }
               else if(counter==2){
                   System.out.print("h");
               }
               else if(counter==3){
                   System.out.print("i");
               }
           }
           else if(str.charAt(i) == '5'){
               if(counter==1){
                   System.out.print("j");
               }
               else if(counter==2){
                   System.out.print("k");
               }
               else if(counter==3){
                   System.out.print("l");
               }
           }
           else if(str.charAt(i) == '6'){
               if(counter==1){
                   System.out.print("m");
               }
               else if(counter==2){
                   System.out.print("n");
               }
               else if(counter==3){
                   System.out.print("o");
               }
           }
           else if(str.charAt(i) == '7'){
               if(counter==1){
                   System.out.print("p");
               }
               else if(counter==2){
                   System.out.print("q");
               }
               else if(counter==3){
                   System.out.print("r");
               }
               else if(counter==4){
                   System.out.print("s");
               }
           }
           else if(str.charAt(i) == '8'){
               if(counter==1){
                   System.out.print("t");
               }
               else if(counter==2){
                   System.out.print("u");
               }
               else if(counter==3){
                   System.out.print("v");
               }
           }
            else if(str.charAt(i) == '9'){
                if(counter==1){
                    System.out.print("w");
                }
                else if(counter==2){
                    System.out.print("x");
                }
                else if(counter==3){
                    System.out.print("y");
                }
                else if(counter==4){
                    System.out.print("z");
                }
            }



            counter = 1;
            if(j >=str.length()){
                break;
            }
            if(str.charAt(j) == ' '){
                i=j+1;
            }
            else{
                i = j;
            }


        }

    }
}
