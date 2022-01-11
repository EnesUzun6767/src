package day25_CustomMethod_Overloading;

public class Task3MergeArray {
    public static void main(String[] args) {
        
    }
    public static int[] mergeOfArrays (int arr1[],int arr2[]){
        int count=0;
        int[]arr3=new int[arr2.length+arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[count]=arr1[i];
            count++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[count]=arr2[i];
            count++;
        }
        return arr3;
    }
    public static String[] mergeOfArrays (String arr1[],String arr2[]){
        int count=0;
        String[]arr3=new String[arr2.length+arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[count]=arr1[i];
            count++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[count]=arr2[i];
            count++;
        }
        return arr3;
    }
    public static char[] mergeOfArrays (char arr1[],char arr2[]){
        int count=0;
        char[]arr3=new char[arr2.length+arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[count]=arr1[i];
            count++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[count]=arr2[i];
            count++;
        }
        return arr3;
    }
    public static double[] mergeOfArrays (double arr1[],double arr2[]){
        int count=0;
        double[]arr3=new double[arr2.length+arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[count]=arr1[i];
            count++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[count]=arr2[i];
            count++;
        }
        return arr3;
    }
    
}
/*
Task3:
    1. create a method that can merge two integer arrays.          merger(int[] arr1, int[] arr2)

    2. create a method that can merge two double arrays.          merge(double[] arr1, double[] arr2)

    3. create a method that can merge two char arrays.           merge(char[] arr1, char[] arr2)

    4. create a method that can merge two String arrays.          merge(String[] arr1, String[] arr2)
 */