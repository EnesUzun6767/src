package day12Scanner_Methods;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);//enter
        
        System.out.println("Enter your full  fullName");
        String fullName =scan.nextLine(); // enes uzunenter.

        System.out.println("Enter your Programming Language");
        String programmingLanguage=scan.nextLine();//Java Programming LanguageEnter

        System.out.println("Enter your age:");
        int age=scan.nextInt();//37enter   only reads 37

        scan.nextLine(); //takes the Enter from 37Enter we can continue to input the School Name now.

        System.out.println("Enter your school nameOfDay:");
        String schoolName= scan.nextLine();// there was enter in memeory (37enter) Enter works here
        // so gives answer of previous steps.School nameOfDay we can not enter.Enter has already read by nextline.

        System.out.println("fullName = " + fullName);
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

scan.close();

    }
}// 123Enter 
/*if you use nextline after the other methods we MUST provide one additional */
