package day24Tasks;

import java.util.Arrays;

public class Task8ReverseArray {
    public static void main(String[] args) {
        int[]numbers={1,3,5,7,9};
        int[]reversed1=reversed(numbers);
        System.out.println(Arrays.toString(reversed1));
    }
    public static int[]reversed(int[] array){
        int[]reverse=new int[array.length];
        for (int i = array.length-1,j=0; i>=0; i--,j++) {
            reverse[j]=array[i];
        }
        return reverse ;
        }

}
/*
8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
 */