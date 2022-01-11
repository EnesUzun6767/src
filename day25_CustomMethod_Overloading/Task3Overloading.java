package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class Task3Overloading {
    public static void main(String[] args) {
        int[]number={1,2,3,4};
        int[]number2=addElement(number,7);
        String[] str={"aa","bb"};
        String[]str1=addElement(str,"cc");
        double[]num={1.3,3.2,3,7};
        double[]num1=addElement(num,3.9);
        System.out.println(Arrays.toString(num1));


    }


    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element;
        return result;
    }
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element;

        return result;

    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;

        }
        result[i] = element;
        return result;
    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;

        }
        result[i] = element;
        return result;
    }
}
