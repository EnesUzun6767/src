package day16_ForLoopStringPractise;

import java.util.Scanner;

/*
 Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */
public class Count_Char {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a string");
        String sentences=scan.next();

        System.out.println("Enter a character");
        String ch=scan.next();
        int counter=0;

        for (int i = 0; i < sentences.length(); i++) {
            String chr=""+sentences.charAt(i);
            if(ch.equalsIgnoreCase(chr)){
                counter++;
            }
        }
        System.out.println("Character "+ch+" repeats in sentences"+" "+counter+" times");
    }
}
