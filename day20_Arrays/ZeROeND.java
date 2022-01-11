package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZeROeND {
    public static void main(String[] args) {

        System.out.println("Enter Array size");
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();

        int [] arr =  new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter "+(i+1)+" elements");
            arr[i] = scan.nextInt();

        }


        int [] arrColon = new int[arr.length];
        int ct = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){

                arrColon[ct] += arr[i];
                ct++;
            }

        }
        System.out.println(Arrays.toString(arrColon));


    }
}
