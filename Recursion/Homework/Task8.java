public class Task8 {
    //print array elements using recursion

    static void printArray(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        System.out.print(arr[i] + " ");
        printArray(arr, i + 1);
    }

    static int sum(int[] arr, int i) {

        if (i == arr.length) {
            return 0;
        }

        return arr[i] + sum(arr, i + 1);
    }

    static int max(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }

        return Math.max(arr[i], max(arr, i + 1));
    }

    static void reverse(int[] arr, int i) {

        if (i == arr.length / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
        reverse(arr, i + 1);
    }
    //most duplicated value in an array

    ////        printArray(arr,0);
//
//        int counter = 0;
//        int maxCounter = 0;
//        for(int i =0; i <arr.length; i++){
//            for(int j = i ;j <arr.length; j++){
//                if(arr[i]==arr[j]){
//                    counter++;
//                }
//
//            }
//            if(counter >=maxCounter){
//                maxCounter = counter;
//            }
//        }
    static int findElement(int[] arr, int maxCounter, int i, int j, int num) {

        if (i == arr.length) {
            return num;
        }
        int counter = insideRec(arr, i, j, 0);
        if (counter >= maxCounter) {
            maxCounter = counter;
            num = arr[i];
        }

        return findElement(arr, maxCounter, i + 1, j, num);


    }

    static int insideRec(int[] arr, int i, int j, int counter) {
        if (j == arr.length) {
            return counter;
        }
        if (arr[i] == arr[j]) {
            counter++;
        }

        return insideRec(arr, i, j + 1, counter);

    }

    static void findFrequency(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            counter = 0;
            if (visited[i]) {
                continue;
            }
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                    visited[j] = true;
                }
            }


            System.out.println("Number " + arr[i] + " is found " + counter + " times");

        }
    }

    static void frequencies(int[] arr, int i, int j, int counter, boolean[] visited) {

        if (i == arr.length) {

            return;
        }
        if (!visited[i]) {  //if visited[i] == false
            counter = innerRec(arr, i, i, 0, visited);
            System.out.println("Number " + arr[i] + " is found  " + counter + " times.");

        }
        frequencies(arr, i + 1, j, counter, visited);
    }

    static int innerRec(int[] arr, int i, int j, int counter, boolean[] visited) {

        if (j == arr.length) {
            return counter;
        }

        if (arr[i] == arr[j]) {
            counter++;
            visited[j] = true;
        }
        return innerRec(arr, i, j + 1, counter, visited);
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 3, 7, 2, 7};
//        printArray(arr,0);
//        System.out.println();
//        System.out.println(sum(arr,0));
//        System.out.println(max(arr,0));
//        reverse(arr,0);
////        printArray(arr,0);
//
        //       System.out.println(findElement(arr,0,0,0,0));

        boolean[] visited = new boolean[arr.length];
        frequencies(arr, 0, 0, 0, visited);


    }
}
