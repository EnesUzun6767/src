package day13_String;
import java.util.Scanner;

/*
Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and
if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output)
	Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person:
	Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method



 */
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)?");
        String split= scan.next();
        System.out.println("Enter the number of people");
        int number= scan.nextInt();
        System.out.println("Enter the check amount");
        double amount= scan.nextDouble();
        System.out.println("How was the service quality?");
        String quality= scan.next();
        double percent=0;
        if(quality.equalsIgnoreCase("Excellent")){
            percent=0.25;
        }else if(quality.equalsIgnoreCase("Great")){
            percent=0.20;
        }else if(quality.equalsIgnoreCase("Good")){
            percent=0.15;
        }else if(quality.equalsIgnoreCase("Fair")){
            percent=0.10;
        }else{
            percent=0.5;
        }

        double totalPay=amount*(1+percent);
        double totalTip=totalPay-amount;
        System.out.println("Number of people: "+number);
        System.out.println("Total to pay: "+totalPay);

        if(split.equalsIgnoreCase("Yes")){
            System.out.println("Total to pay: "+totalPay);
            System.out.println("Total to tip: "+totalTip);
        }else{
            System.out.println("Total per person: "+totalPay/number);
            System.out.println("Tip per person: "+totalTip/number);
        }
    }
}
