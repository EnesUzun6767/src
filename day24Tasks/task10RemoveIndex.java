package day24Tasks;

import java.util.Arrays;

public class task10RemoveIndex {
    public static void main(String[] args) {
int[]array={1,3,5,6,7,8,9,11,12,14,15,17};
    int[] array1d=removeIndex(array,4);
        System.out.println(Arrays.toString(array1d));

    }
    public static int[] removeIndex(int[]array,int index){
int[]array1d=new int[array.length-1];
int count=0;
        for (int i = 0; i < index; i++) {
            array1d[count]=array[i];
            count++;
        }
        for (int i =index+1; i < array.length; i++) {
            array1d[count]=array[i];
            count++;
        }
        return array1d;
    }
}
/*
10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */