package day16_ForLoopStringPractise;

import java.util.Locale;
import java.util.Scanner;

public class SameNumberOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String word = scan.nextLine();
        word = word.toLowerCase(Locale.ROOT);

        System.out.println("Enter first word");
        String first = scan.next();
        first = first.toLowerCase(Locale.ROOT);

        System.out.println("Enter second word");
        String second = scan.next();
        second = second.toLowerCase(Locale.ROOT);

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.contains(first)&&word.contains(second)) {
                word = word.replaceFirst(first, "");
                word=word.replaceFirst(second,"");
                count++;

                }
        }
        if(word.contains(first)||word.contains(second)){//checks still contain any of chosen words.
            System.out.println(false);
        }else {
            System.out.println(true);
        }
        System.out.println(count);//repeating both how many times.
        System.out.println(word);// left over after trimming repeated words
    }
}

