package day15_For_Loop;

import java.util.Locale;
import java.util.Scanner;

/*
Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str= scan.next();
        str=str.toLowerCase(Locale.ROOT);

        char ch1='x';
        if(str.contains("x")){
            str=str.replace("x","a");

        }
        System.out.println(str);



    }


}
