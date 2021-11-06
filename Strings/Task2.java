public class Task2 {

    public static void main(String[] args) {

        String name = "Hyulia Mustafa";
        String[] arr= name.split(" ");

        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i].charAt(0));
        }
    }
}
