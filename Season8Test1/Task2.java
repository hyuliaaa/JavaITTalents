import java.awt.*;

public class Task2 {
    public static void main(String[] args){

        String str = "This test has some pretty fun tasks";
        System.out.println(sortAl(str));

    }

    static String sortAl(String str){
        str= str.trim();
        str =str.toLowerCase();
        String[] words = str.split(" ");

        for(int i =0; i <words.length;i++){
            for(int j =0; j <words.length - 1;j++){
                if(words[j].charAt(0)>words[j+1].charAt(0)){
                        String tmp = words[j];
                        words[j]=words[j+1];
                        words[j+1] = tmp;
                }

                if(words[j].charAt(0)==words[j+1].charAt(0)){
                    int minLen = 0;
                    if(words[j].length()<words[j+1].length()){
                        minLen = words[j].length();
                    }
                    else {
                        minLen = words[j+1].length();
                    }

                    for(int k = 1; k <minLen;k++){
                        if(words[j].charAt(k) > words[j+1].charAt(k)){
                            String tmp = words[j];
                            words[j]=words[j+1];
                            words[j+1] = tmp;
                            break;
                        }
                    }
                }
            }
        }

        StringBuilder s = new StringBuilder();
        for(int i = 0 ; i <words.length; i++){
            s.append(words[i]);
            s.append(" ");
        }
        return s.toString();
    }
}
