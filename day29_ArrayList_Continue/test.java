package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 40, 30, 50, 80, 90, 110, 110, 70, 90));
        int max = Collections.max(numbers);
        System.out.println("max = " + max);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for (int i = 1; i < 3; i++) {
            int nThMax = Collections.max(numbers);
            numbers.removeAll(Arrays.asList(nThMax));
        }
        int thirdMax = Collections.max(numbers);
        System.out.println("thirdMax = " + thirdMax);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(65, 65, 55, 70, 70, 90, 85, 80, 100));
        ArrayList<Integer> uniques = new ArrayList<>(scores);
        uniques.removeIf(s -> Collections.frequency(scores, s) > 1);
        System.out.println(uniques);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        ArrayList<Integer> unix = new ArrayList<>();
        for (int each : scores) {
            int freq = Collections.frequency(scores, each);
            if (freq == 1) {
                unix.add(each);
            }
        }
        System.out.println(unix);



    }
}