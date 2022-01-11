package day27_WrapperClasses;

import java.util.Arrays;

public class DinnerTask1I_Insert_Parameter {
    public static void main(String[] args) {

int[]array={1,2,4,5,6,7,8,9};
array=insertNumber(array,4,3);
        System.out.println(Arrays.toString(array));

    }
    public static int[]insertNumber(int[]array,int index,int newValue){
        array[index]=newValue;
        return array;
    }
    public static double[]insertNumber(double[]array,int index,double newValue){
        array[index]=newValue;
        return array;
    }
    public static char[]insertNumber(char[]array,int index,char newValue){
        array[index]=newValue;
        return array;
    }
    public static String[]insertNumber(String[]array,int index,String newValue){
        array[index]=newValue;
        return array;
    }
}
