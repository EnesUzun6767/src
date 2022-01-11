package day15_For_Loop;

import java.util.Locale;
import java.util.Scanner;

/*
 Write a program that asks user to enter first and last names,
  and then prints the full nameOfDay in regular format
  (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first nameOfDay");
        String firstName=scan.next();

        System.out.println("Enter last nameOfDay");
        String lastName=scan.next();

//firstName=(""+firstName.charAt(0).toUppercase+firstName.substring(1).toLowercase().
        String firstCh1=firstName.substring(0,1).toUpperCase(Locale.ROOT);
        String continue1=firstName.substring(1).toLowerCase(Locale.ROOT);
        firstName=""+firstCh1+continue1;
        System.out.println(firstName);

        lastName=(""+lastName.charAt(0)).toUpperCase(Locale.ROOT)+lastName.substring(1).toLowerCase(Locale.ROOT);
        System.out.println(lastName);

        System.out.println("================================");
       String s1=firstName.toUpperCase(Locale.ROOT).charAt(0)+firstName.substring(1);
        System.out.println(s1);
        String s2=lastName.toUpperCase(Locale.ROOT).charAt(0)+lastName.substring(1);
        System.out.println(s2);


    }
}
