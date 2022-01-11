package day24Tasks;

import java.util.Arrays;

public class task6AddElement {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        int num=6;
        int[]array1=array(array,num);
        System.out.println(Arrays.toString(array1));


    }
    public static int[]array(int[]arr,int num){
        int[]array1=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            array1[i]=arr[i];
        }
        array1[arr.length]=num;

        return array1;
    }
}
/*

    6. create a method named addElement that takes one integer array and one integer,
    the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
 */