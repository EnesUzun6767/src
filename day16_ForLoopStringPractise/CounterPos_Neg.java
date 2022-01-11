package day16_ForLoopStringPractise;

import java.util.Scanner;

/*
Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */
public class CounterPos_Neg {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count1=0;
        int count2=0;
        System.out.println("Enter 5 numbers");
        for (int i = 0; i<5 ; i++) {
            int number=scan.nextInt();
            if(number>0){
                count1++;
            }if(number<0){
                count2++;
            }
        }
        System.out.println("Positive: "+count1);
        System.out.println("Negative: "+count2);

    }
}
