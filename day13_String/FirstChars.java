package day13_String;

import java.util.Locale;
import java.util.Scanner;

public class FirstChars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first nameOfDay");
        String firstName=scan.next();
        System.out.println("Enter your last nameOfDay");
        String lastName= scan.next();
        System.out.println(firstName.toUpperCase(Locale.ROOT).charAt(0)+"."+lastName.toUpperCase(Locale.ROOT).charAt(0));
    }
}
