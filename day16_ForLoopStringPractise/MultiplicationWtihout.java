package day16_ForLoopStringPractise;

import java.util.Scanner;

public class MultiplicationWtihout {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int total=0;


            if(num1>0&&num2>0) {
                for (int i=1; i<= num2; i++) {
                    total += num1;
                }
            }else{
                System.out.println("Invalid");
            }

        System.out.println("Multiple of numbers equals to: "+total);
    }
}
