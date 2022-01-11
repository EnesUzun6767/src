package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your word");
        String word=scan.next();
        word=word.toLowerCase(Locale.ROOT);

        System.out.println("checking words");
        String check=scan.next();
        check.toLowerCase(Locale.ROOT);

        int count=0;

        for (int i = 0; i < word.length(); i++) {
            if(word.contains(check)){
                count++;
                word=word.replaceFirst(check,"");
            }
        }
        System.out.println(count);

    }
}
