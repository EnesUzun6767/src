package day14_String;

import java.util.Locale;
import java.util.Scanner;

/*
Create a class called EmailTask2.
       Assume that email address is constructed by person's first nameOfDay and followed by an underscore and last nameOfDay.

       Write a program that will print out information about user based on email. Print first nameOfDay, last nameOfDay, and domain.

       First and Last nameOfDay should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input: 
                       craig_federighi@apple.com

                Output: 
                    First nameOfDay: Craig
                    Last nameOfDay: Federighi
                    Domain: apple

 */
public class Task8_Email2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your email address");
        String email=scan.next();
        
        String firstName=email.substring(0,email.indexOf("_"));
        String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));

        firstName=""+firstName.substring(0,1).toUpperCase(Locale.ROOT)+firstName.substring(1);
        lastName=""+lastName.substring(0,1).toUpperCase(Locale.ROOT)+lastName.substring(1);

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);
    }
}
