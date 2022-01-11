package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="acdb";
        String str2="dbca";
        char[]ch1=str1.toCharArray();//converted String to char
        char[]ch2=str2.toCharArray();
        Arrays.sort(ch1);// ordered by ascending
        Arrays.sort(ch2);
        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println("anagram = " + anagram);
    }
}
//write as program that can check string build by same character