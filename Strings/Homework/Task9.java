import java.util.Scanner;

public class Task9 {


    static int arrayToNumber(String arr) {  // ne raboti kogato imame izraz ot vida 12-13-14

        int number = 0;
        int prevNumber = 0;
        boolean isStartingWithMinus = false;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(0) == '-') {
                if (i + 1 < arr.length()) {
                    int n = arr.charAt(i + 1) - '0';
                    number = number * 10 + n;
                    isStartingWithMinus = true;
                }

            } else {
                if (arr.charAt(i) == '-') {
                    prevNumber = number;
                    number = 0;
                    int n = arr.charAt(i + 1) - '0';
                    number = number * 10 + n;
                    isStartingWithMinus = true;
                    i++;
                } else {
                    int n = arr.charAt(i) - '0';
                    number = number * 10 + n;

                }
            }


        }
        int finalNum = 0;
        if (isStartingWithMinus) {
            finalNum = prevNumber + (-1 * number);
        } else {
                 finalNum = number;
        }
        return finalNum;
    }

    static boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

    static int findSum(String arr) {
        int sum = 0;
        int number = 0;
        for (int i = 0; i < arr.length() - 1; i++) {
            if (arr.charAt(i) == '-' && isNumber(arr.charAt(i + 1))) {
                int n = arr.charAt(i + 1);
                number = number * 10 + n;
            } else if (isNumber(arr.charAt(i))) {
                int n = arr.charAt(i);
                number = number * 10 + n;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();

        String regex = str.replaceAll("[^-0-9]", " ");
        regex = regex.trim();
        regex = regex.replaceAll("[ ]+", " ");  //[ ]+represents one or more regular spaces next to each other
        System.out.println(regex);

        String[] number = regex.split(" ");

        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += arrayToNumber(number[i]);
        }

        System.out.println(sum);


    }

    static void inLesson() {


        String str = " asd-12sdf45-56asdf100";

        boolean isNegative = false;
        int num = 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '-') {
                if (num != 0) {
                    if (isNegative) {
                        num = -1 * num;

                    }
                    sum += num;
                    num = 0;

                }

                isNegative = true;
            } else {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    num = num * 10 + (str.charAt(i) - '0');
                    if (i == str.length() - 1) {
                        if (isNegative) {
                            num = num * -1;
                        }

                        sum += num;
                    }
                } else {

                    if (num != 0) {
                        if (isNegative) {
                            num = num * -1;

                        }

                        sum += num;
                        isNegative = false;
                        num = 0;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}



