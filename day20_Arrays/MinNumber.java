package day20_Arrays;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();
        int[] numbers = new int[length];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min+"is the minimum one");
    }
}


