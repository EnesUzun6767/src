package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class task2AddElementsToArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] arrays = addString(array, 5);
        System.out.println(Arrays.toString(arrays));

        String[] names = {"enes", "semra", "ahmet"};
        names = addString(names, "eymen");
        System.out.println(Arrays.toString(names));
        char[]ch={'a','b','c'};
        ch=addChar(ch,'d');
        System.out.println(Arrays.toString(ch));
    }
    public static double[] addDouble(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }
    public static int[] addString(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element;
        return result;
    }

    public static String[] addString(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;

        }
        result[i] = element;
        return result;
    }

    public static char[] addChar(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;

        }
        result[i] = element;
        return result;
    }
}

