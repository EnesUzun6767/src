package day16_ForLoopStringPractise;

import java.util.Locale;
import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String word1 = word.substring(1, 5);
        String word2 = word.substring(0, 4);
        if (word1.contains("java") || word2.contains("java")) {
            System.out.println("true");
        } else {
            System.out.println("false");


        }
    }
}
