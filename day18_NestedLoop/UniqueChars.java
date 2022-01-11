package day18_NestedLoop;

import java.util.Scanner;

public class UniqueChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.next();
        String result = "";
        String nonRip = "";
        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            while (!(nonRip.contains(ch))) {
                nonRip += ch;
            }
        }
        System.out.println(nonRip);
        for (int i = 0; i < nonRip.length(); i++) {
            char ch1 = nonRip.charAt(i);
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch1 == ch2) {
                    counter++;
                }
            }
            if (counter == 1) {
                result += ch1;
            }
        }

        System.out.println(result);
    }
}