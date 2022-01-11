package day19_LoopPractise;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd numbers");
            }
            System.out.println("Would you like to continue? a: yes/no");
           String a=scan.next();

            if((!a.equals("yes")||a.equals("no"))){
                System.exit(0);
            }
            if(a.equals("no")){
                break;
            }


        }
    }
}