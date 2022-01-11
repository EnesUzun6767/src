package day00_Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ZeroMovesEnd {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        int freq=Collections.frequency(list,0);
        list.removeIf(integer -> integer==0);
        for (int i = 0; i < freq; i++) {
            list.add(0);
        }
        System.out.println(list);
    }
}
/*2. Write a program that can move all the zeros to the last indexes of ArrayList

        Ex:
        list: {1,0,2,0,3,0,4,0}

        output:
        [1, 2, 3, 4, 0, 0, 0, 0]
        */