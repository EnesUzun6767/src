package day19_LoopPractise;

import java.util.Scanner;

/*
Write a program that can return the first duplicated character from a string
 */
public class FirstDuplicated {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
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

                }if(count==2){
                    result+=general;

            }

        }
        System.out.println(result.charAt(0));
    }
}
