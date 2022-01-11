package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class ZerotoEnd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length=scan.nextInt();
        int numbers[]=new int[length];
        int hero2zero[]=new int[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt();
        }
        for (int i = 0,j=0; i < numbers.length; i++,j++) {
            if(numbers[i]==0){
                hero2zero[j]=numbers[i+1];
            }else{
                hero2zero[i]=numbers[i];
            }
        }
        System.out.println(Arrays.toString(hero2zero));


    }
}
