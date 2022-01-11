package day24Tasks;

import java.util.Scanner;

public class task5FrequencyOfNumber {
    public static void main(String[] args) {
        int[]numb={1,2,1,5,1,7,7,4,3,1};
        int frequency=frequencyOfInteger(numb,1);
        System.out.println(1+" repeats "+frequency+" times");
    }
    public static int frequencyOfInteger(int[] numbers,int num){
       int count=0;

        for (int number:numbers) {
           if( number==num){
               count++;
           }
        }
        return count;
    }
}
/*

    5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */