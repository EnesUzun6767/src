package day15_For_Loop;

import java.util.Scanner;

/*
Write a program that asks user to enter a word.
 If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

 */
public class Task1 {
    public static void main(String[] args) {
        Scanner  scan=new Scanner(System.in);

        System.out.println("Enter a string");
        String str=scan.next();
        char ch=str.charAt(0);

        if(ch=='x'){
            str=str.replaceFirst("x","a");

        }
        System.out.println(str);

    }
}
