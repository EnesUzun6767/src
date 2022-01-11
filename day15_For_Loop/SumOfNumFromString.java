package day15_For_Loop;

import java.util.Scanner;

public class SumOfNumFromString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your string");
       String str=scan.next();
       int sum=0;
       int num=0;
        for(int i=1;i<=str.length()-1;i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
               sum+=str.charAt(i)-48 ;
            }
        }
        System.out.println("total number in string is "+sum);

    }
}
