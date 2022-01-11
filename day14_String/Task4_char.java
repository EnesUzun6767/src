package day14_String;

import java.util.Scanner;

/*
Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table
 */
public class Task4_char {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        if (word.charAt(0) >= 48 && word.charAt(0)<= 57) {
            System.out.println("first character is digit");
        } else if (word.charAt(0) >= 65 && word.charAt(0)<= 90) {
            System.out.println("first character is uppercase letter");
        } else if (word.charAt(0) >= 97 && word.charAt(0) <= 122) {
            System.out.println("first letter is lower case");
        } else if ((word.charAt(0) >= 32 && word.charAt(0) <= 47) || (word.charAt(0) >= 58 && word.charAt(0) <= 64) || (word.charAt(0) >= 65 && word.charAt(0)<= 90)
                || (word.charAt(0) >= 91 && word.charAt(0) <= 96) || (word.charAt(0) >= 123 && word.charAt(0)<= 126)) {
            System.out.println("first letter is special character");
        }
    }
}