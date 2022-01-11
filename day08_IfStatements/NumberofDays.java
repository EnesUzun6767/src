package day08_IfStatements;

public class NumberofDays {
    public static void main(String[] args) {
        int month=7;

        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println(" month has 31 days");
        }else if(month==4||month==6||month==9||month==11){
            System.out.println("month has 30 days");
        }else{
            System.out.println("month has 28 days");
        }
    }
}/*
Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1;

            output:
                31 Days

            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
*/
