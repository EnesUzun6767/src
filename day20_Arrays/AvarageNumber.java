package day20_Arrays;

import java.util.Scanner;

public class AvarageNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[]num=new int[6];
        double sum=0.0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter a number");
            num[i]=scan.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        System.out.println(sum/6+" is the average");
    }
}
