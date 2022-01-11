package day24_CustomMethod_Return;

import java.util.Arrays;

public class MergeTwoArrayMethod {
    public static void main(String[] args) {
        String[]arr1={"Hello","Cydeo","Batch 25"};
        String[]arr2={"Muhtar","is","the","Best"};
        String[]arr3=mergeOfArrays(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
    }
    public static String[] mergeOfArrays (String arr1[],String arr2[]){
       int count=0;
       String[]arr3=new String[arr2.length+arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[count]=arr1[i];
            count++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[count]=arr2[i];
            count++;
        }
        return arr3;
        }
    }

/*5.create a method that can merge two arrays and return the new array*/