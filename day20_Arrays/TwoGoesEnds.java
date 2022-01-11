package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoGoesEnds {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int length= scan.nextInt();
        int[] numbers=new int[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the term number "+(i+1));
numbers[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        int[]arrays=new int[length];
        int count=0;
        for (int i = 0; i < arrays.length; i++) {
            if(numbers[i]!=2){
                arrays[count]=numbers[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(arrays));
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            arrays[length-(i+1)]=2;
        }
        System.out.println(Arrays.toString(arrays));
        }
    }

