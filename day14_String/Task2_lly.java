package day14_String;

import java.util.Scanner;

/*
2. ask the user to enter a word. if the word ends with "ly", print "really???"
 ,  otherwise, print "never mind"
 */
public class Task2_lly {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.next();

        if(word.substring(word.length()-2).equalsIgnoreCase("ly")) {
            System.out.println(word+"???");
        }
    }
}
