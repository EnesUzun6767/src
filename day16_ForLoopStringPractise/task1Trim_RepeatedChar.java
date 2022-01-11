package day16_ForLoopStringPractise;

import java.util.Scanner;

/*
Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each character of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding
 */
public class task1Trim_RepeatedChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.next();
        String nonRep="";
        for(int i=0;i<=str.length()-1;i++){
            String ch=""+str.charAt(i);
            if(!(nonRep.contains(ch))){
           nonRep+=ch;
        }
    }System.out.println(nonRep);

}
}