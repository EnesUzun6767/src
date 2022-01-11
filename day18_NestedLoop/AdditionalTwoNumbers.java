package day18_NestedLoop;

import java.util.Scanner;

public class AdditionalTwoNumbers {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your first number");
            int num1 = scan.nextInt();
            System.out.println("Enter your second number");
            int num2 = scan.nextInt();
            System.out.println("Addition:" + (num1 + num2));

            System.out.println("Would you like to continue?");
            String answer = scan.next();

            while(!(answer.equalsIgnoreCase("yes")
                    ||(answer.equalsIgnoreCase("no")))){
                System.out.println("Invalid entry");
                System.out.println("Would you like to continue?");
                 answer = scan.next();
            }


            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}