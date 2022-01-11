package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseOfSecond {
    public static void main(String[] args) {
        String word="My life be like";
        String[]wrd=word.split(" ");
        String reverses="";
        System.out.println(Arrays.toString(wrd));
        for (int i = wrd[1].length()-1; i>=0; i--) {
            reverses+=wrd[1].charAt(i);
        }
        System.out.println(reverses);
        wrd[1]=reverses;
        System.out.println(Arrays.toString(wrd));
    }
}
