package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseNumber {
    public static void main(String[] args) {
        int[]numbers={10,20,30,40,50};
        int[] reversed=new int[numbers.length];

            for (int i =numbers.length-1 ; i >= 0; i--) {
                reversed[i]=numbers[numbers.length-1-i];
            }


        System.out.println(Arrays.toString(reversed));
    }
}
