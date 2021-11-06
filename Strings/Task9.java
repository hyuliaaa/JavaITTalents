import java.util.Scanner;

public class Task9 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder str =new StringBuilder();
        for(int i =0; i <=n; i ++){
            str.append(i);
        }

        System.out.println(str);

        int m = sc.nextInt();
        char c = (char) (m +'0');

        for(int i =0; i <str.length(); i++){
            if(c==str.charAt(i)){
                System.out.println(i);
                return;
            }
        }


    }


}
