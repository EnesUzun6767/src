package day26CustomMethodPractise;

import Utility.ArraysUtility;

public class RemoveElements2 {

    public static int[]removeElement(int[]array,int index){
        int[]result={};
        for (int i = 0; i < array.length; i++) {
            if(i!=index){
               result= ArraysUtility.addElements(result,array[i]);
            }
        }
        return result;
    }
    public static char[]removeElement(char[]array,int index){
        char[]result={};
        for (int i = 0; i < array.length; i++) {
            if(i!=index){
                result= ArraysUtility.addElements(result,array[i]);
            }
        }
        return result;
    }
    public static String[]removeElement(String[]array,int index){
        String[]result={};
        for (int i = 0; i < array.length; i++) {
            if(i!=index){
                result= ArraysUtility.addElements(result,array[i]);
            }
        }
        return result;
    }
    public static double[]removeElement(double[]array,int index){
        double[]result={};
        for (int i = 0; i < array.length; i++) {
            if(i!=index){
                result= ArraysUtility.addElements(result,array[i]);
            }
        }
        return result;
    }
}
