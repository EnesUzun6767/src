package day20_Arrays;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many numbers wish to add?");
        int length=scan.nextInt();
        int[]numbers=new int[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
        }
        int max=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];
        }
        }
        System.out.println("Maximum number in the number is "+max);
    }
}
