package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultidimensinalArray2 {
    public static void main(String[] args) {
        int[] group1={1, 2, 3};
        int[]group2={4, 5, 6, 7, 8};
        int[]group3={9, 10, 11, 12, 13};
        int[][]arr2D={{1, 2, 3},{4, 5, 6, 7, 8},{9, 10, 11, 12, 13}};

        //                   0           1               0      1
        int[][][]arr3D={{{1, 2, 3},{4, 5, 6, 7, 8}},  {{5,6},{3,7,9}}};
                       //            0                       1
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[1][0]));
        System.out.println(arr3D[1][0][1]);
        for (int[][] each2D : arr3D) {
            for (int[] each1D : each2D) {
                for (int each : each1D) {
                    System.out.println(each);

                }

            }


        }
    }
}
