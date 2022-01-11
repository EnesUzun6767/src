package day27_WrapperClasses;

import java.util.Arrays;

public class DinnerTask2_Swap {
    public static void main(String[] args) {
int[]array={1,3,4,5,6,7};
array=swap(array,2,4);
        System.out.println(Arrays.toString(array));
    }
    public static int[] swap(int[]array, int index1, int index2){
        int nothing=array[index2];
        array[index2]=array[index1];
        array[index1]=nothing;
        return array;
    }
    public static double[] swap(double[]array, int index1, int index2){
        double nothing=array[index2];
        array[index2]=array[index1];
        array[index1]=nothing;
        return array;
    }
    public static char[] swap(char[]array, int index1, int index2) {
        char nothing = array[index2];
        array[index2] = array[index1];
        array[index1] = nothing;
        return array;
    }
    public static String[] swap(String []array, int index1, int index2) {
       String nothing = array[index2];
        array[index2] = array[index1];
        array[index1] = nothing;
        return array;
    }
}
