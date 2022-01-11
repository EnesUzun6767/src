package day11Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);//allows us to input value

        System.out.println("Enter an integer");
     int num1=scan.nextInt();

     System.out.println("Enter a decimal");
     double num2=scan.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication of numbers"+(num1*num2));
         scan.close();//closes the scanner,after this scanner can not be used anymore




    }
}
