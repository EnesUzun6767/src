package day27_WrapperClasses;

import Utility.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,4};
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }


    //
    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};//{1,
        for (int each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElements(result, each);
            }
        }
        return result;
    }
    public static char[] removeDuplicates(char[] array){

        char[] result = {};//{1,
        for (char each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElements(result, each);
            }
        }
        return result;
    }
    public static double[] removeDuplicates(double[] array){

        double[] result = {};//{1,
        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElements(result, each);
            }
        }
        return result;
    }
    public static String[] removeDuplicates(String[] array){

        String[] result = {};//{1,
        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElements(result, each);
            }
        }
        return result;
    }
    
}
