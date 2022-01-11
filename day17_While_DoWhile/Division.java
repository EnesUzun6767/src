package day17_While_DoWhile;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1= scan.nextInt();
        int number2=scan.nextInt();
        int div= 0;
        if (number1>=number2) {
            for (int i = number1; i >= number2; i -= number2) {
                div += 1;

            }
        }
        System.out.println(div);
    }
}

