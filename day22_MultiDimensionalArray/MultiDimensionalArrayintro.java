package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayintro {
    public static void main(String[] args) {
        String[]group1={"a","b","c"};
        String[]group2={"d","e","f"};
        String[]group3={"g","h","i"};

String[][]groups=new String[3][];  //index;'0,1,2
groups[0]=group1;
groups[1]=group2;
groups[2]=group3;
        System.out.println(Arrays.toString(group1));//1 dimensional array

        System.out.println(Arrays.deepToString(groups));
        System.out.println("---------------------------------------");

//                      0 1 2   0 1 2 3   0 1  2  3  4
        int[][]arr2D={ {1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //                0         1           2

        System.out.println(Arrays.deepToString(arr2D));//All of them
        System.out.println(Arrays.toString(arr2D[1]));//[4,5,6,7]  just 1 array

        System.out.println(arr2D[1][2]);//1 element inside the array.


    }
}
/*
String[]group1={"a","b","c"}
String[]group2={"d","e","f"}
String[]group3={"g","h","i"}
 */