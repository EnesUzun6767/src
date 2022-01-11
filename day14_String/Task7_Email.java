package day14_String;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
 7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first nameOfDay and followed by an underscore and last nameOfDay.

        Write a program that can swap first nameOfDay with last nameOfDay in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */
public class Task7_Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email");

            String email = scan.next();
        if (email.contains("_")) {
            String name = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            String newEmail = "" + lastName + "_" + name + email.substring(email.indexOf("@"));
            System.out.println(newEmail);
        }else{
            System.out.println("Invalid Email address");
        }

    }
}
