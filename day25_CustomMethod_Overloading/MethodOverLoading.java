package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverLoading {
    public static void main(String[] args) {
        int[] intArray = {4, 2, 7, 8, 5};
        double[] doubleArray = {10.4, 22.3, 12.4, 5.0};
        char[] charArray = {'c', 'z', 'a', 'd'};
        Arrays.sort(intArray);
        Arrays.sort(doubleArray);
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(charArray));



        int result=sumOfNumbers(10,20,30,40);
        System.out.println(result);
double resultdecimal=sumOfNumbers(1.2,2.3,3.7);
        System.out.println(resultdecimal);
    }


    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;

    }
    public static double sumOfNumbers(double num1,double num2){
        return num1+num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static double sumOfNumbers(double num1,double num2,double num3){
        return num1+num2+num3;
    }
    public static int sumOfNumbers(int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }
    public static double sumOfNumbers(double num1, double num2, double num3, double num4) {
        return num1 + num2 + num3 + num4;
    }
}