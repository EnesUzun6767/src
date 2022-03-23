package A_Group_8_Java_Coding.Week4;

import java.util.*;

public class SameLetters {
    public static void main(String[] args) {
        String s1 = "abbacd";
        String s2 = "bbaadc";
        System.out.println("s1 and s2 has same letters is  " + sameLetters(s1, s2));
    }
    public static boolean sameLetters(String a, String b) {
        boolean result = false;
        String a1 = "";
        String b1 = "";
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(a.split("")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(b.split("")));
        Map<String, Integer> map1 = new TreeMap<>();
        Map<String, Integer> map2 = new TreeMap<>();

        for (String each : list1) {
            int freq = Collections.frequency(list1, each);
            map1.put(each, freq);
        }
        for (Map.Entry<String, Integer> pairs1 : map1.entrySet()) {
            a1+=pairs1.getKey()+""+pairs1.getValue();
        }
        for (String each : list2) {
            int freq1 = Collections.frequency(list2, each);
            map2.put(each, freq1);
        }
        for (Map.Entry<String, Integer> pairs2 : map2.entrySet()) {
            b1+=pairs2.getKey()+""+pairs2.getValue();
        }
        result = a1.equals(b1);
        return result;
    }
}
    /*• Write a return method that check if a string is build out of the same letters as another
string.
• Ex: same("abc", "cab"); -> true
• same("abc", "abb"); -> false:

     */

