package Utility;

import java.util.Arrays;

public class ArraysUtility {
    public static void printEach(int[] array) {
        for (int each : array) {
            System.out.print(each + " ");
        }
    }
    public static void printEach(double[] array) {
        for (double each : array) {
            System.out.print(each + " ");
        }

    }
    public static void printEach(char[] array) {
        for (char each : array) {
            System.out.print(each + " ");
        }
    }
    public static void printEach(long[] array) {
        for (long each : array) {
            System.out.print(each + " ");
        }
    }

    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        int max = numbers[numbers.length - 1];
        return max;
    }
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        double max = numbers[numbers.length - 1];
        return max;
    }
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        int min = numbers[0];
        return min;
    }
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        double min = numbers[0];
        return min;
    }

    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
                return result;
            }
        }
        return result;
    }
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
                return result;
            }
        }
        return result;
    }
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
                return result;
            }
        }
        return result;
    }

    //checks if the given String is contained in the given array. returns boolean.
    public static boolean contains(String[] array, String element) {

        boolean result = false;

        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }

        return result;
    }

    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int[] addElements(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }
    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElements(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }
    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElements(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }
    //4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElements(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    //frequency of element in array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (element == each) {
                count++;
            }
        }
        return count;
    }
    public static double frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (element == each) {
                count++;
            }
        }
        return count;
    }
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (element == each) {
                count++;
            }
        }
        return count;
    }
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }

    //remove the element at index number
    public static int[] removeElement(int[] array, int index) {
        int[] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElements(result, array[i]);
            }
        }
        return result;
    }
    public static char[] removeElement(char[] array, int index) {
        char[] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElements(result, array[i]);
            }
        }
        return result;
    }
    public static String[] removeElement(String[] array, int index) {
        String[] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElements(result, array[i]);
            }
        }
        return result;
    }
    public static double[] removeElement(double[] array, int index) {
        double[] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addElements(result, array[i]);
            }
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElements(result, each);
        }
        for (int each : arr2) {
            result = addElements(result, each);

        }
        return result;
    }
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};

        for (double each : arr1) {
            result = ArraysUtility.addElements(result, each);
        }
        for (double each : arr2) {
            result = addElements(result, each);

        }
        return result;

    }
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};

        for (char each : arr1) {
            result = ArraysUtility.addElements(result, each);
        }
        for (char each : arr2) {
            result = addElements(result, each);

        }
        return result;
    }
    public static String[] merge(String[]arr1,String[]arr2) {
        String[] result = {};

        for (String each : arr1) {
            result = ArraysUtility.addElements(result, each);
        }
        for (String each : arr2) {
            result = addElements(result, each);

        }
        return result;
    }
    //reverse array
    public static int[]reverse(int[]array){
        int[]result=new int[array.length];
        for (int i = array.length-1,j=0; i >=0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }
    public static double[]reverse(double[]array){
        double[]result=new double[array.length];
        for (int i = array.length-1,j=0; i >=0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }
    public static char[]reverse(char[]array){
        char[]result=new char[array.length];
        for (int i = array.length-1,j=0; i >=0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }
    public static String[]reverse(String[]array){
        String[]result=new String[array.length];
        for (int i = array.length-1,j=0; i >=0; i--,j++) {
            result[j]=array[i];
        }
        return result;
    }
    public static String repeatingCharWithRepeatingValues(String str){
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            if (!(nonDup.contains(ch))) {
                nonDup += ch;
            }

        }
        System.out.println(nonDup);
        String result = "";

        for (int i = 0; i < nonDup.length(); i++) {
            String general = "" + nonDup.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                String each = "" + str.charAt(j);
                if (general.equals(each)) {
                    count++;
                }
            }
            result += count + general;

        }
        return  result;
    }
    public static int[] replaceAll(int[] arr, int oldElement, int newElement){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            if (newArr[i] == oldElement){
                newArr[i] = newElement;
            }
        }
        return newArr;
    }



    public static double[] replaceAll(double[] arr, double oldElement, double newElement){
        double[] newArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            if (newArr[i] == oldElement){
                newArr[i] = newElement;
            }
        }
        return newArr;
    }


    public static char[] replaceAll(char[] arr, char oldElement, char newElement){
        char[] newArr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            if (newArr[i] == oldElement){
                newArr[i] = newElement;
            }
        }
        return newArr;
    }

    public static String[] replaceAll(String[] arr, String oldElement, String newElement){
        String[] newArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            if (newArr[i].equals(oldElement)){
                newArr[i] = newElement;
            }
        }
        return newArr;
    }
    //replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


    //replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


    //replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


    //replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }
    public static int[] removeDuplicates(int[] array){

        int[] result = {};//{1,
        for (int each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElements(result, each);
            }
        }
        return result;
    }
    public static char[] removeDuplicates(char[] array){

        char[] result = {};//{1,
        for (char each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElements(result, each);
            }
        }
        return result;
    }
    public static double[] removeDuplicates(double[] array){

        double[] result = {};//{1,
        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElements(result, each);
            }
        }
        return result;
    }
    public static String[] removeDuplicates(String[] array){

        String[] result = {};//{1,
        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElements(result, each);
            }
        }
        return result;
    }
}
