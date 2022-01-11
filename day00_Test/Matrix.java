package day00_Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {


        int[][] matrix = {{1,  2,  3,  4},
                          {5,  6,  7,  8},
                          {9,  10, 11, 12},
                          {13, 14, 15, 16}};
int[][]matrax=matrix;
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                list.add(matrix[j][i]);
            }

            }
        int[]matrix2=new int[16];
            int a=0;
            for (Integer each:list) {
                matrix2[a]=each;
                a++;
            }
            int b=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrax[i][j]=matrix2[b];
                b++;
            }
        }

        System.out.println(list);
        System.out.println(Arrays.toString(matrix2));
        System.out.println(Arrays.deepToString(matrax));
    }
}