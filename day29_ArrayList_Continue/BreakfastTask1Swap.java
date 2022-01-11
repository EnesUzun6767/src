package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BreakfastTask1Swap {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);
    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList of Integers
 */