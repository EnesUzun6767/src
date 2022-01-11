package day20_Arrays;

import java.util.Arrays;

public class Hero2Zero {
    public static void main(String[] args) {
        int[] numbers = {10, 0, 1, 5, 0, 1, 0};
        int[] hero2zero = new int[7];
        int a = 0;
        for (int i = 0,j=0; i < numbers.length-3; i++,j++) {
           if(numbers[i]==0){
               hero2zero[j]=numbers[i+1];
           }else{
               hero2zero[i]=numbers[i];
           }
        }
        System.out.println(Arrays.toString(hero2zero));

    }
}
