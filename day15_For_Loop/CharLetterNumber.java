package day15_For_Loop;

import java.util.Scanner;

/*
write a program that can restive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */
public class CharLetterNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.next();
        String ch="";
        String letter="";
        String digit="";
        for(int i=0;i<=str.length()-1;i++) {
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))) {
                letter += str.charAt(i);
            } else if ((str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                digit += +str.charAt(i);
            } else {
                if (str.charAt(i) != ' ') {
                    ch += str.charAt(i);
                }
            }
        }
        System.out.print("ch = " + ch+"  ");

        System.out.print("digit = " + digit+"  ");
        System.out.print("letter = " + letter+"  ");
        }

    }

