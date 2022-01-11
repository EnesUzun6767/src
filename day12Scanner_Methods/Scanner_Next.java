package day12Scanner_Methods;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your nameOfDay");
        String name=scan.next();// Java Programming   reads until spaces
        System.out.println("nameOfDay = " + name);// Java

   scan.close();
    }
}
