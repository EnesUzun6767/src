package day22_MultiDimensionalArray;

import java.util.Arrays;

public class Task1Reverse {
    public static void main(String[] args) {
        int[][]nums2D= { {1,2,3}, {4,5,6}};

        int[][] reverse = new int[nums2D.length][nums2D[0].length];

        for (int i = 0; i < nums2D.length; i++) {
            for (int j = 0; j < nums2D[i].length; j++) {

                reverse[i][j] = nums2D[nums2D.length-1 -i][nums2D[i].length-1-j];
            }
        }
        System.out.println(Arrays.deepToString(reverse));
            






















    }
}
/*
Write a program that can reverse a two-dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};

 */