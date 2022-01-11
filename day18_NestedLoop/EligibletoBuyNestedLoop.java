package day18_NestedLoop;

import java.util.Scanner;

public class EligibletoBuyNestedLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your age:");
            int age = scan.nextInt();
            while (!(age >= 1 && age <= 120)) {
                System.out.println("Invalid entry please re-enter");
                System.out.println("Enter your age:");
                age = scan.nextInt();
            }
            System.out.println("Would you like to continue?");
            String a= scan.next();
while(!(a.equalsIgnoreCase("yes")||(a.equalsIgnoreCase("no")))){
    System.out.println("Invalid entry re-enter Would you like to continue?");
    a= scan.next();
}
        if(a.equalsIgnoreCase("no")){
            break;
        }

        }
    }
}