package day18_NestedLoop;

import java.util.Scanner;

public class CydeoCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while(true) {
            System.out.println("Enter your first number:");
            int num1 = scan.nextInt();
            System.out.println("Choose your math operator");
            String operator = scan.next();
            while(!((operator.equals("+"))||(operator.equals("-"))
                    ||(operator.equals("*"))||(operator.equals("/")))) {
                System.out.println("Invalid entry re-enter");
                operator = scan.next();
            }
            System.out.println("Enter second number");
                int num2=scan.nextInt();
                int result=0;
                if(operator.equals("+")){
                    result=num1+num2;
                }else if(operator.equals("-")) {
                result=num1-num2;
                }else if(operator.equals("/")){
                    result=num1/num2;
                }else{
                    result=num1*num2;
                }
                System.out.println(result);
                System.out.println("Would you like yo continue ?");
                String answer=scan.next();
                while(!((answer.equalsIgnoreCase("Yes"))||(answer.equalsIgnoreCase("No")))){
                    System.out.println("Invalid answer please re-enter");
                    answer=scan.next();
                }
if(answer.equalsIgnoreCase("no")){
    break;
}
            }
        }

    }

