package day15_For_Loop;

import java.util.Scanner;

public class MinOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       int min=214483647;
        for(int i=1;i<=5;i++){
            System.out.println("Enter a number");
            int num=scan.nextInt();

            if(num<min){
                min=num;
            }
        }
        System.out.println(min+" is the minimum number");
    }
}
