package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BreakfastTask2MoveZeros {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        int count=0;
        for (int each: numbers) {
            if(each==0){
                count++;
            }
        }
        numbers.removeIf(number->number==0);
        System.out.println(numbers);
        for (int i = 0; i < count; i++) {
            numbers.add(0);
        }
        System.out.println(numbers);

    }
}
/*
2. Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]
 */