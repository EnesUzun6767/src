package day12Scanner_Methods;

import java.util.Scanner;

public class NextLineMethod_Practise {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your age");
        int age= scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your fullname");
        String fullName=scan.nextLine();

        System.out.println("Enter your GPA");
        double score=scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter your school nameOfDay");
        String schoolName=scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("score = " + score);
        System.out.println("schoolName = " + schoolName);

        scan.close();
    }
}
/*
enter age
enter fullname

 */