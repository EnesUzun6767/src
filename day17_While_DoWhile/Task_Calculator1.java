package day17_While_DoWhile;

import java.util.Scanner;

/*
 Write a program that can divide two positive numbers
 without using / (division) and * (multiplication) operators.
 */
public class Task_Calculator1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two integers");
         int num1=scan.nextInt();
         int num2=scan.nextInt();
         String operations=scan.next();
         int result=0;
         int count=0;
if(operations.equals("*")){
         for(int i=1;i<=num2;i++ ){
             result+=num1;
         }
             System.out.println(result);
         }else{
    while(num1>num2){
        num1-=num2;
        count++;
    }
    System.out.println(count);
         }
    }
}

