package day25_CustomMethod_Overloading;

import Utility.ArraysUtility;

public class test2 {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        ArraysUtility.printEach(array);
        System.out.println("                                      ");
        char[]array1={'a','b','c'};
        ArraysUtility.printEach(array1);
        System.out.println("                                      ");
   int[]array2={2,5,1,9,7};
   int max= ArraysUtility.max(array2);
        System.out.println(max);
        int min= ArraysUtility.min(array2);
        System.out.println(min);


    }
}
