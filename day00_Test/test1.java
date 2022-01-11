package day00_Test;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};
        int[] arr3 = {8,9,10,11,12,13};

        int[][] arr = new int[3][];
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;

        int[][] result= new int [arr.length][];
        for (int i = arr.length-1, a=0; i >=0; i--,a++) {
            for (int j = arr[i].length-1,b=0; j >=0 ; j--,b++) {
                result[a][b]=arr[i][j];
            }

        }

        System.out.println(Arrays.deepToString(result));

    }


}