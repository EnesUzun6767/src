package day15_For_Loop;

import java.util.Scanner;

public class MaxOfFiveNumber {
    public static void main(String[] args) {
        Scanner  scan=new Scanner(System.in);
       int max=-999999999;
        for(int i=1;i<=5;i++){
            System.out.println("Enter a number");
            int num=scan.nextInt();
            if(num>max) {
                max = num;
            }
        }System.out.println(max+" is the maximum");
    }
}
