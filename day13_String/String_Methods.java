package day13_String;

import java.util.Locale;
import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {
        String word1="Cydeo";
        char thirdChar=word1.charAt(2);
        String word="EnesUzun";
        String s1="B25 is the best batch";
        int l1=s1.length();
        int length=word.length();
        System.out.println("length  word= " + length);
        System.out.println(word.charAt(word.length()-1));
        System.out.println(s1.charAt(l1-1));
        System.out.println(s1.charAt(s1.length()-1));
        System.out.println(s1.toUpperCase(Locale.ROOT));
        System.out.println(word1.toLowerCase(Locale.ROOT)+word.toUpperCase(Locale.ROOT));

    }
}
