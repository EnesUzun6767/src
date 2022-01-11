package day04_Variables;

import com.sun.tools.javac.Main;

public class Salary_Calculator {
    public static void main(String[] args) {
        int hourlyRate=65;
        int weeklyHours=40;
        int numberOfWeeks=52;
        int salary=hourlyRate*weeklyHours*numberOfWeeks;
        //soutv  shortcut of names written
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate =$ " + hourlyRate);
        System.out.println("salary = $" + salary);
    }
}
