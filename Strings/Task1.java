import java.util.Scanner;

public class Task1 {

    //дали даден символен низ е префикс на друг низ
    public static void main(String[] args) {

        String str = "achyuli";
        String str2 = "ac";

        boolean isPrefix = true;
        for(int i = 0; i <str2.length(); i++){
            if(str2.charAt(i)!=str.charAt(i)){
                isPrefix = false;
                break;
            }
        }

        if (isPrefix){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
