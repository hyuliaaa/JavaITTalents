import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;
public class MyFirst {

    static void printReverse(int[] arr, int len){
        if(len == 1){
            System.out.print(arr[0]);
            return;
        }
        System.out.print(arr[len-1]+ " ");
        printReverse(arr,len-1);
    }

    static void print(int[] arr, int n, int i){
        if(i == n){
            return;
        }
        System.out.print(arr[i] + " ");
        print(arr,n,i+1);
    }

    static int sum(int[] arr, int n){
        if(n==1){
            return arr[0];
        }

        return arr[n-1] + sum(arr,n-1);
    }

    static int sum1(int[] arr, int n, int i){
        if(i == n){
            return 0;
        }
        return arr[i] + sum1(arr,n,i+1);
    }

    static int max(int a, int b){
        return a > b ? a : b;
    }

    static boolean appearsIn(int[] arr, int n, int x){
        if(n==1){
            return x == arr[0];
        }
        if(x == arr[n-1]){
            return true;
        }
        return appearsIn(arr,n-1,x);
    }

    static int occurences(int[] arr, int n, int x){
        if(n==1){
            if(x==arr[0]){
                return 1;
            }
            else {
                return 0;
            }
        }
        if(x == arr[n-1]){
            return 1+occurences(arr,n-1,x);
        }
        else
        {
            return occurences(arr, n - 1, x);
        }
    }

    static void invert(int[] arr, int i, int j){
        if(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            invert(arr,i+1, j-1);
        }
    }

    static boolean isPalindrome(int[] arr, int i, int j){
        if( i < j){
        if(arr[i] !=arr[j]){
            return false;
        }
            return isPalindrome(arr,i+1,j-1);
        }
        return true;
    }

    static int countDigits(int num){
        if(num<10){
            return 1;
        }
        return 1 + countDigits(num/10);
    }

    static int reverseNumber(int num, int i){
        if(num<=0){
            return 0;
        }

        return (num%10)*(int)Math.pow(10,i-1) + reverseNumber(num/10, i-1);
    }

    static int revNum(int num, int revN){
        if(num==0){
            return revN;
        }

        return revNum(num / 10, revN * 10+ num % 10);
    }
    static int maxN(int[] arr, int n){
        if(n==1){
            return arr[0];
        }
        if(n==2){
            return max(arr[0],arr[1]);
        }
        return max(arr[n-1], maxN(arr,n-1));
    }

    static int min(int a, int b){
        return a<b? a : b;
    }

    static int minDiv(int[] arr, int n){ //task1 - homework for loops
        if(n==1){
            if(arr[0] % 3 == 0){
                return arr[0];
            }else {
                return 1;
            }
        }
        if(arr[n-1] % 3 == 0){
            return min(arr[n-1],minDiv(arr,n-1));
        }
        else {
            return minDiv(arr,n-1);
        }

    }

    static int[] construct(int[] arr, int n){
        int[] newArr = new int[arr.length];


        return newArr;
    }



    public static void main(String[] args) {

        int[] arr= {10,3,5,8,6,-3,7};
      //  System.out.println(sum(arr,arr.length));
       // System.out.println(sum1(arr,arr.length,0));
      //  System.out.println((maxN(arr,arr.length)));
        //System.out.println(appearsIn(arr,arr.length,7));
        //System.out.println(occurences(arr,arr.length,8));
       // printReverse(arr,arr.length);
       // invert(arr,0,arr.length-1);
        //print(arr,arr.length,0);
      //  System.out.println(isPalindrome(arr,0,arr.length-1));
       // System.out.println(countDigits(2123));
       // System.out.println(reverseNumber(123,countDigits(123)));
        System.out.println(minDiv(arr,arr.length));
    }

}
