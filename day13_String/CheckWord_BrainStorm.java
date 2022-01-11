package day13_String;

import java.util.Scanner;

public class CheckWord_BrainStorm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word:");
        String w1 = scan.next();
        System.out.println("Enter your second word:");
        String w2 = scan.next();
        System.out.println("Enter your third word:");
        String w3 = scan.next();
        String result ="";

        if(w1.length() == w2.length() && w3.length() == w2.length()){
            result = "All words are the same length";

        }else if (w1.length() != w2.length() && w3.length() != w2.length() && w1.length() != w3.length()){
            result = "All different length";
        }else{
            result = "Not Same nor Different lengths";
        }
        System.out.println("result = " + result);
        scan.close();
    }
}

