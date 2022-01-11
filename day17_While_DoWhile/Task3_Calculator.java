package day17_While_DoWhile;

import java.util.Scanner;

/*
3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to
		re-enter the operator until user provides a valid operator (+, -, *, /)
 */
public class Task3_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number");
        int num2 = scan.nextInt();
        System.out.println("Enter math operator");
        String operator = scan.next();
        int result = 0;

        while (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))) {
            System.out.println("Invalid operator");
            System.out.println("Enter math operator");
            operator = scan.next();
        }
        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else {
            result = num1 / num2;
        }

        System.out.println(result);
    }


}
