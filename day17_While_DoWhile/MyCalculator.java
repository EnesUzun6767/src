package day17_While_DoWhile;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Enter your operator");
        String operator = scan.next();
        if(!(operator.equals("+") || operator.equals("-")|| operator.equals("/")|| operator.equals("8"))) {
            System.out.println("please re enter operator");
            operator = scan.next();
            }
        }
    }

