import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] names = line.split(",");

        int firstNameSum = findSumAscii(names[0]);
        int secondNameSum = findSumAscii(names[1]);

        System.out.println("Output: ");
        if(firstNameSum > secondNameSum){
            System.out.println(names[0]);
        }
        else{
            System.out.println(names[1]);
        }

    }

    static int findSumAscii(String name){
        int sum = 0;
        for(int i =0; i <name.length(); i++){
            sum +=name.charAt(i);
        }
        return sum;
    }
}
