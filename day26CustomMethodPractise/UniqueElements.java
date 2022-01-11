package day26CustomMethodPractise;

import Utility.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[]arr={1,1,2,2,3,4,5,6,4};
        int[]unique=uniqueElements(arr);
        System.out.println(Arrays.toString(unique));
    }//returns the unique elements of the array
    public static int[] uniqueElements(int[] array){
        int[]result={};
        int count=0;
        for (int each: array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){// if the freq is one,the element is unique
                result=ArraysUtility.addElements(result,each);
            }

        }
        return result;
    }
}
