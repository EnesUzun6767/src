package day17_While_DoWhile;

import java.util.Scanner;

public class DivisibleTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        System.out.print("Divisble by 15: ");
        for (int i = 0; i <= num; i += 15) {
            System.out.print(+i + " ");
        }
        System.out.println();
        System.out.print("divisible by 3: ");
        for (int i = 0; i <= num; i += 3) {
            if (i % 15 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("divisible by 5: ");
        for (int i = 0; i <= num; i += 5) {
            if (i % 15 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

