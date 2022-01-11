package day17_While_DoWhile;

import java.util.Scanner;
/*
Write a program that calculates the sum of numbers entered by
the user until user enters a negative number.

 */
public class Task2_sumOfNumUntilNegative {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int result=0;

        System.out.println("Enter first number:");
        int num1=scan.nextInt();
        System.out.println("Enter your second number:");
        int num2=scan.nextInt();
        while(num1>0&&num2>0){
            result=num1+num2;
            System.out.println("result: "+result);
            System.out.println("Enter first number:");
             num1=scan.nextInt();
            System.out.println("Enter your second number:");
           num2=scan.nextInt();
        }

        }

    }

