package day20_Arrays;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String reversedName="";
        System.out.println("How many numbers would you like to enter?");
        int length=scan.nextInt();
        int[]numbers=new int[length];
        for (int i = 0; i<length; i++) {
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt();
        }
        for (int i = length-1; i >=0; i--){

            if(i==0){
                reversedName+=numbers[i];
            }else{
                reversedName+=numbers[i]+",";
            }
        }
        System.out.println("ReversedNumbers={"+ reversedName+"}");
    }
}
