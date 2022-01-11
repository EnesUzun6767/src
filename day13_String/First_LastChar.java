package day13_String;

import java.util.Scanner;

/*
1. write a program that can check
 if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */
public class First_LastChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.next();
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            System.out.println("first and last character are same");
        }
        else{
            System.out.println("First and last are different");
        }
    }
}