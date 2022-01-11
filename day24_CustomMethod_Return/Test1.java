package day24_CustomMethod_Return;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter number: " + (i + 1));
            array[i] = scan.nextInt();
        }
        int[] arr1 = new int[length + 1];
        arr1[0] = length;
        for (int i = 1; i < length + 1; i++) {
            arr1[i] = array[i - 1];
        }
        for (int i = 0; i < length-1; i++) {
            if(array[i]<array[i+1]) {

            System.out.println(Arrays.toString(arr1)+" is sorted");
            break;
            } else {
                System.out.println(Arrays.toString(arr1)+" is not sorted");
                break;
            }
        }

        }
    }
