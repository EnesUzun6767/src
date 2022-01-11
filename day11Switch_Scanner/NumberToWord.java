package day11Switch_Scanner;
/*
2. Write a program that can convert numbers 0~9 to words.

    NOTE: MUST use ternary
 /*2. Write a program that can convert numbers 0~9 to words.

        NOTE: MUST use ternary*/

public class NumberToWord {
    public static void main(String[] args) {
     int num=9;
     String result=(num<=7&&num>=0)?(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":
             (num==4)?"Thursday":(num==5)?"Friday":(num==6)?"Saturday":"Sunday":"Invalid number";
        System.out.println(result);
    }
}
