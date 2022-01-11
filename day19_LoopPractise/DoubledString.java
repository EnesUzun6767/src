package day19_LoopPractise;

import java.util.Locale;
import java.util.Scanner;

public class DoubledString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word=scan.next().toLowerCase(Locale.ROOT);
         String result="";


        for (int i = 0; i < word.length(); i++) {
            char general=word.charAt(i);
            int count=0;
            if(result.contains(""+general)){
                continue;

            }
            for (int j = 0; j < word.length(); j++) {
                char each=word.charAt(j);
                if(general==each){
                    count++;
                }

            }
            if(count==2){
                result+=general;
            }
        }
        System.out.println(result);
    }
}
