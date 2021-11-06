public class Task6 {

    //concatenates elements of char array to string;
    public static void main(String[] args) {
        char[] arr = {'a','b','c'};
        StringBuilder str = new StringBuilder();
        StringBuilder str1= new StringBuilder(String.valueOf(arr)); //1 method
        String s2 = new String(arr); //2 method


        for(int i =0; i<arr.length; i++){ //third method
            str.append(arr[i]);
        }

        System.out.println(str);
    }
}
