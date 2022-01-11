package day15_For_Loop;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scan.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
