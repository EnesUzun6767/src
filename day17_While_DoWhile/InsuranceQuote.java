package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full nameOfDay :");
        String fullName = scan.nextLine();
        System.out.println("Enter your gender");
        String gender = scan.next().toUpperCase(Locale.ROOT);
        while (!(gender.equals("M") || gender.equals("F"))) {
            System.out.println("Invalid entry! Please re-enter your gender");
            gender = scan.next().toUpperCase(Locale.ROOT);
        }
        System.out.println("Enter your age");
        int age = scan.nextInt();
        while (!(age > 0 && age < 120)) {
            System.out.println("Invalid entry! Please re-enter your age");
            System.out.println("Enter your age");
            age = scan.nextInt();

        }
        System.out.println("Enter how many miles drive in a day?");
        double miles = scan.nextDouble();
        while (!(miles > 5 || miles < 0)) {
            System.out.println("Invalid entry! Please re-enter your miles");
            System.out.println("Enter how many miles drive in a day?");
            miles = scan.nextDouble();

        }
        System.out.println("Would you like to have option 1.Fullcoverage or 2.Liability Inusrance");
        int option = scan.nextInt();
        System.out.println("Have you ever had any accident or claims in past five years?");
        String answer = scan.next().toUpperCase(Locale.ROOT);
        while (!(answer.equals("YES") || answer.equals("NO"))) {
            System.out.println("Invalid entry please re-enter");
            System.out.println("Have you ever had any accident or claims in past five years?");
            answer = scan.next().toUpperCase(Locale.ROOT);
        }
        System.out.println("Does your car has an anti-theft device?");
        String answer2 = scan.next();
        while (!(answer2.equals("YES") || answer.equals("NO"))) {
            System.out.println("Invalid entry please re-enter");
            System.out.println("Does your car has an anti-teft device?");
            answer2 = scan.next();

        }
        System.out.println("Are you married?");
        String answer3 = scan.next();
        double total$ = 0;

        if (option == 1) {
            if (age < 25) {
                age += 90;
            } else {
                total$ += 50;
            }
            if (miles < 10) {
                total$ += 10;
            } else if (miles >= 10 && miles <= 50) {
                total$ += 30;
            } else {
                total$ += 50;
            }

        } else {
            if (age < 25) {
                total$ += 160;
            } else {
                total$ += 120;
            }
            if (miles <= 10) {
                total$ = 20;
            } else if (miles >= 10 && miles <= 50) {
                total$ += 40;
            } else {
                total$ += 70;
            }
            if (answer2.equals("YES") && (answer.equals("YES") && answer3.equals("YES"))) {
                total$ *= total$ * 1.05;
            } else if (answer2.equals("YES") && (answer.equals("YES") && answer3.equals("NO"))) {
                total$ *= 1.10;
            } else if (answer2.equals("YES") && (answer.equals("NO") && answer3.equals("YES"))) {
                total$ *= 0.80;
            } else if (answer2.equals("YES") && (answer.equals("NO") && answer3.equals("NO"))) {
                total$ *= 1.10;
            } else if (answer2.equals("NO") && (answer.equals("YES") && answer3.equals("YES"))) {
                total$ *= 1.10;
            } else if (answer2.equals("NO") && (answer.equals("YES") && answer3.equals("NO"))) {
                total$ *= 1.15;
            } else if (answer2.equals("NO") && (answer.equals("NO") && answer3.equals("YES"))) {
                total$ *= 0.85;
            } else {
                total$ *= 0.90;
            }

        }
        System.out.println("Dear"+fullName+"your total is: "+total$);
    }
}
