package day13_String;

import java.util.Scanner;

public class CharAt_Method {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your first nameOfDay");
        String firstName=scan.next();

        System.out.println("Enter your last naem:");
        String lastName=scan.next();
        char f=firstName.charAt(0);
        char l=lastName.charAt(0);

        String intial=""+f+"."+l;

        System.out.println(intial);
    }
}
