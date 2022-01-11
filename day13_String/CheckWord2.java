package day13_String;

import java.util.Scanner;

/*
 Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

 */
public class CheckWord2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three words");
        String str1= scan.next();
        String str2=scan.next();
        String str3=scan.next();

        if(str1.length()==str2.length()&&str1.length()==str3.length()){
            System.out.println("All words are same length");
        }else if(((str1==str2&&!(str1==str3))||((str1==str3)||!(str1==str2)))||(((str2==str3)&&!(str2==str1))&&((str2==str1)||!(str2==str3))&&
                ((str3==str1&& !(str3==str2))||(str3==str2&&!(str3==str1))))){
            System.out.println("Not Same nor Different lengths");
        } else if(!((str1==str2)&& (str1==str3)&&(str2==str3))){
            System.out.println("All different length");
        }
    }
}
