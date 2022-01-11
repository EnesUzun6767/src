package day00_Test;

import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt();
        int[]arr=new int[length];
        for (int i = 0; i < length; i++) {
            arr[i]= scan.nextInt();
        }
        boolean r2=sum(arr);
        System.out.println(r2);
    }
    public static boolean sum(int[]array){

        int count=0;
        boolean r1=false;
        for (int each:array){
            if(each==10){
                count++;
            }
        }
        if(count==3){
            r1=true;
        }
        return r1;
    }
}
/*
Write a Java program to check if the sum of all the 10's in the array is exactly 30.
Return false if the condition does not satisfy, otherwise true.
 */