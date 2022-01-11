package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoWords {
    public static void main(String[] args) {
        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char ch : ch1) {
            chars[j]= ch;
            j++;
        }

        for (char ch : ch2) {
            chars[j]= ch;
            j++;
        }

        System.out.println(Arrays.toString(chars));

    }
}
