package day15_For_Loop;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word");
        String str=scan.next();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.toUpperCase(Locale.ROOT).charAt(i);

        }
        if(reverse.equalsIgnoreCase(str)){
            System.out.println("input: "+str+"\n output: "+reverse);
            System.out.println("TRUE");
        }else{
            System.out.println("try again");
        }
    }
}
