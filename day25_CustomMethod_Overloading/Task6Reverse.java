package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class Task6Reverse {
    public static void main(String[] args) {

        
    }
    public static String[] reversed(String[] str){
        String[]reverse=new String[str.length];
        for (int i=str.length-1,j=0; i>=0;i--,j++) {
          reverse[j]=str[i];
        }
        return reverse;
    }
    public static int[] reversed(int[] str){
        int[]reverse=new int[str.length];
        for (int i=str.length-1,j=0; i>=0;i--,j++) {
            reverse[j]=str[i];
        }
        return reverse;
    }
    public static char[] reversed(char[] str){
        char[]reverse=new char[str.length];
        for (int i=str.length-1,j=0; i>=0;i--,j++) {
            reverse[j]=str[i];
        }
        return reverse;
    }
    public static double[] reversed(double[] str){
        double[]reverse=new double[str.length];
        for (int i=str.length-1,j=0; i>=0;i--,j++) {
            reverse[j]=str[i];
        }
        return reverse;
    }
}
