package day12Scanner_Methods;
/*
 SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome


 */
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your hourly rate:");
        double hourlyRate= scan.nextDouble();

        System.out.println("how many hours do you work in a week");
        int weeklyHours=scan.nextInt();

        System.out.println("Enter state tax rate:");
        double stateTaxRate=scan.nextDouble();

        System.out.println("Enter federal tax rate");
        double federalTaxRate=scan.nextDouble();

        double grossIncome=hourlyRate*weeklyHours*52;
        double stateTax=grossIncome*stateTaxRate;
        double federalTax=grossIncome*federalTaxRate;
        double totalTax=stateTax+federalTax;
        double netIncome=grossIncome-totalTax;
        System.out.println("grossIncome = " + grossIncome);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);
        scan.close();
    }
}
