package day15_For_Loop;

import java.util.Scanner;

public class Total5Number {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int total = 0;
        for(int i=1;i<=5;i++){
            System.out.println("Enter a number");
            total+=scan.nextInt();
        }
        System.out.println(total);
    }
}
