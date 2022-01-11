package day16_ForLoopStringPractise;

import java.util.Scanner;
/*
Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */
public class task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.next();
        String unq="";
        for(int i=0;i<=str.length()-1;i++){
        char ch1 =str.charAt(i);
       if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
           //ilk karakterin yeri ile son karakterin yeri aynisi ise
unq+=ch1;
            }

        }
        System.out.println(unq+" is unique letters in string");
        String name="enes";
        int a=name.indexOf("e");
        int b=name.lastIndexOf("e");
        System.out.println(a);
        System.out.println(b);
    }
}
