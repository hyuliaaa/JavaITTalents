import java.util.Locale;

public class Task1 {


    static StringBuilder toggle(String str){
        StringBuilder newStr = new StringBuilder();

        for(int i= 0 ; i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                char n = (char) (str.charAt(i) - ('a' - 'A'));
                newStr.append(n);
            }
            else {
                char n = (char) (str.charAt(i) + ('a' - 'A'));
                newStr.append(n);
            }
        }
        return newStr;
    }

    static int totalWords(String str){
        str = str.trim();
        String[] words = str.split(" ");
        return words.length;
    }

    static int totalW(String str){
        int counter = 1;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i)==' '){
                counter++;
            }
        }
        return counter;
    }

    static char[] reverse(String str){
        char[] arr = str.toCharArray();
        for(int i =1; i <str.length()/2;i++){
           char tmp = arr[i-1];
           arr[i-1] = arr[i];
           arr[i]=tmp;


        }
        return arr;
    }

    static StringBuilder reverseOrderOfWords(String str){
        str=str.trim();
        String[] words = str.split(" ");
        StringBuilder s = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--){
                s.append(words[i]);
                s.append(" ");

        }
        return s;
    }

    static void firstOccurrence(String s, char c){
        for(int i =0; i <s.length(); i++){
            if(s.charAt(i)==c){
                System.out.println(i);
            }
        }

    }

    static void minimumCh(String str){
        int min = Integer.MAX_VALUE;
        int counter = 0;
        char minCh = ' ';
        boolean[] visited= new boolean[str.length()];
        for(int i = 0; i <str.length();i++){
            if(!visited[i]) {
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        counter++;
                        visited[j]= true;
                    }

                    if(counter < min){
                        min = counter;
                        minCh = str.charAt(i);
                    }
                }
            }

        }

        System.out.println("Min occurring character:" + minCh +" :" + min);

    }


    static void countFrequency1(String str){

        int counter = 0;
        int c = ' ';
        boolean[] visited = new boolean[str.length()];
        for(int i =0; i <str.length(); i++){
            if(!visited[i]){
                for(int j = i ; j <str.length(); j++){
                    if(str.charAt(i)==str.charAt(j)){
                        counter++;
                        visited[j]= true;
                        c = str.charAt(i);
                    }
                }

                System.out.println(str.charAt(i) + " occurs " + counter + " times");
                counter = 0;

            }


        }
    }

    static void countFrequency2(String str){

        int[] arr = new int[26];
        for(int i =0; i <str.length();i++){
            arr[str.charAt(i) -'a']+=1;
        }

        for(int i =0; i <arr.length;i++){
            if(arr[i]!=0){
                System.out.println((char)(i+'a')+" " + arr[i]);
            }
        }
    }

    static String removeFOcc(String str, char c){
        StringBuilder s = new StringBuilder(str);

        for(int i =0; i<s.length();i++){
            if(c == s.charAt(i)){
                s.deleteCharAt(i);
                break;
            }
        }

        return s.toString();

    }

    static String removeOccurrences(String str, char c){
        StringBuilder s = new StringBuilder(str);
        for(int i =0; i <s.length();i++){

            if(c==s.charAt(i)){
                if(s.charAt(i+1)==c){
                    s.deleteCharAt(i);
                    s.deleteCharAt(i);
                }
                else {
                    s.deleteCharAt(i);
                }
            }
        }
        return s.toString();
    }

    static void removeChar(String s, char c){
        int j = 0;
        int counter = 0;
        char[] arr = new char[s.length()];
        for(int i = 0; i <s.length();i++){
            if(c!=s.charAt(i)){
                arr[j] = s.charAt(i);
                j++;
                counter++;

            }

        }

        char[] newArr = new char[counter];
        for(int i =0 ;i < newArr.length;i++){
            newArr[i] = arr[i];
        }

        System.out.println(newArr);
    }

    static String removeRepeated(String str){
        StringBuilder s = new StringBuilder(str);

        for(int i =0; i <s.length();i++){
            for(int j =i+1; j <s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    s.deleteCharAt(j);
                }
            }
        }
        return s.toString();
    }

    static String replace(String str, char c, char x){
        StringBuilder s = new StringBuilder(str);
        for(int i = 0 ; i < s.length(); i++){
            if(c==s.charAt(i)){
                s.setCharAt(i,x);

            }
        }
        return s.toString();
    }

    static int countWord(String str, String word){
        str = str.trim();
        int counter = 0;
        String[] words = str.split(" ");
        for (int i =0; i <words.length;i++){
            if(words[i].equals(word)){
                counter++;
            }
        }
        return counter;
    }

    static String removeAllOccurrences(String str, String word){
        str = str.trim();
        str =str.replace(word,"");
        return str;
    }

    static String removeFirstOccurrence(String str, String word){
        str = str.trim();
        String[] words = str.split(" ");
        boolean met = false;
        StringBuilder s = new StringBuilder();

        for(int i =0; i <words.length;i++){
            if(words[i].equals(word) && !met){
                met = true;

            }
            else {
                s.append(words[i]);
                s.append(" ");
            }
        }
        return s.toString();
    }


    public static void main(String[] args) {
        String str = "baby born baby ";
       // minimumCh("I love Java programming!");
      //    countFrequency1("Hello");
     //   countFrequency2("hello");

        //System.out.println(removeFOcc("I Love Programming", 'o'));
     //   System.out.println(removeFOcc("I Love Programming", 'm'));

      //  removeChar("I Love Programming", 'm');
      //  System.out.println(removeRepeated("Programming in Java!"));

    //    System.out.println(replace("I love programming.", 'o','y'));

       // System.out.println(str.indexOf("love"));
        //System.out.println(str.lastIndexOf("love"));
      //  System.out.println(countWord(str,"love"));
        System.out.println(removeFirstOccurrence(str,"baby"));

//
//        String s = String.valueOf(reverse(str));
//        System.out.println(s);
//
//        System.out.println(reverse(str));
//        char[] arr= {'b','c'};
//        System.out.println(arr);

       // System.out.println(reverseOrderOfWords("I love programming and learning Java"));

   //     firstOccurrence("I love programming", 'o');
        //System.out.println(totalWords(" I love programming"));
        //System.out.println(totalW("I love programming"));
       // System.out.println(toggle(str));

    }
}
