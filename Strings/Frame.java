public class Task10 {

    /*print the following table:
      *******
      *Hello*
      *World*
      *in   *
      *a    *
      *frame*
      *******

       */

    public static void main(String[] args){
        String[] words = {"Hello","world","in","a","frame"};
        int longestWord = 0;
        for(int i =0; i < words.length;i++){
            if(words[i].length() > longestWord){
                longestWord = words[i].length();
            }
        }

        for(int i =0; i <words.length+2;i++){
            if(i==0 || i==words.length+2-1){
                for(int j = 0 ; j <words.length+2;j++){
                    System.out.print('*');
                }
                System.out.println();
            }
            else{
                if(words[i-1].length()==longestWord){
                    System.out.println("*" + words[i-1]+"*");

                }
                else{
                    System.out.print("*"+words[i-1]);
                    for(int j =0; j <words.length-words[i-1].length();j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.println();
                }
            }


        }

    }
}
