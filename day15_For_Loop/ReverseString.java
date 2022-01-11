package day15_For_Loop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String reverse="";

        System.out.println("Enter a sentence");
        String str= scan.nextLine();
         for(int i=str.length()-1;i>=0;i--){
             reverse+=str.charAt(i);
         }
        System.out.println("reverse of sentence is: "+reverse);


    }
}
