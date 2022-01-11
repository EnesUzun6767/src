package day16_ForLoopStringPractise;

import java.util.Locale;
import java.util.Scanner;
/*
write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */
public class Frequencyof_Word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();
        word = word.toUpperCase(Locale.ROOT);
        System.out.println("Enter a special word");
        String special = scan.next();
        special = special.toUpperCase(Locale.ROOT);
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.contains(special)) {
                word = word.replaceFirst(special, " ");
                count++;
            }

        }
        System.out.println(special + " is repated " + count + " times");
        System.out.println(word);
    }
}