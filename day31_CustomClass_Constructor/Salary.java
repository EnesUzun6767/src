package day31_CustomClass_Constructor;

public class Salary {
    public double hourlyRate;
    public double stateTax;
    public double federalTaxRate;
    public int weeklyHours;

    public Salary(double hourlyRate, double stateTax, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTax = stateTax;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "Salary=$ " + hourlyRate*weeklyHours*52 +
                ", totalStateTax=$ " + stateTax*hourlyRate*weeklyHours*52 +
                ", totalFederalTaxRate=$ " + federalTaxRate*hourlyRate*weeklyHours*52 +
                ", SalaryAfterTax=$ " +hourlyRate*weeklyHours*52*(1-stateTax-federalTaxRate)  +
                '}';
    }
}
/*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): claculates the totalstateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */