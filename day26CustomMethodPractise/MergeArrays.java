package day26CustomMethodPractise;

import Utility.ArraysUtility;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[]num1={1,2,3};
        int[]num2={4,5,6,7,8};
        int []num3=ArraysUtility.merge(num1,num2);
        System.out.println(Arrays.toString(num3));
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];

        int i= 0;

        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }


}

