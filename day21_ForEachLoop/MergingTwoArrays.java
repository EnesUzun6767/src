package day21_ForEachLoop;

import java.util.Arrays;

public class MergingTwoArrays {
    public static void main(String[] args) {
    /*
       1. write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}
     */
    int[]arr1={1,2,3,4};
    int[]arr2={5,6};
    int l1=arr1.length, l2=arr2.length;
    int l3=l1+l2;
    int[]arr3=new int[l3];
        for (int i = 0; i < l1; i++) {
                arr3[i]=arr1[i];
        }
        for (int i = l1,j=0; i <l3 ; i++,j++) {
            arr3[i]=arr2[j];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
