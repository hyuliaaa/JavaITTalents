public class task12 {

    public static void main(String[] args) {
        //all numbers after 988 contain at least two same digits, so there is no need to loop after 987
        for (int i = 102; i < 988; i++) {
            int firstDigit = (i / 100) % 10;
            int secondDigit = (i / 10) % 10;
            int lastDigit = i % 10;

            if (firstDigit != secondDigit && secondDigit != lastDigit && firstDigit != lastDigit) {
                System.out.println(i);
            }

        }
    }
}
