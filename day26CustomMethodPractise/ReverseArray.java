package day26CustomMethodPractise;

import Utility.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]a={1,2,3,4};
        int[]r=reverse(a);
        System.out.println(Arrays.toString(r));
    }
    public static int[]reverse(int[]array){
        int[]result=new int[array.length];
        for (int i = array.length-1,j=0; i >=0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }
}
