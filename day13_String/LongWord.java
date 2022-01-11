package day13_String;

import day11Switch_Scanner.SwitchStatement;

import java.util.Scanner;

public class LongWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1=scan.nextLine();

        System.out.println("Enter your second word");
        String word2= scan.nextLine();

        int l1=word1.length();
        int l2=word2.length();

        String result=(l1>l2)? "first word is longer":(l2>l1)? "second word is longer":"equals words";
        System.out.println(result);
        }
    }

