package day24Tasks;

import java.util.Arrays;

public class Task2IsAnagram {
    public static void main(String[] args) {
        String str1 = "Cydeo";
        String str2 = "Cdeoy";
        boolean result = isAnagram(str1, str2);
        System.out.println(result);

    }

    public static boolean isAnagram(String str1, String str2) {
        boolean result = true;
        String[] str1d = str1.split("");
        String[] str1D = str2.split("");
        Arrays.sort(str1D);
        Arrays.sort(str1d);
        result = Arrays.equals(str1D, str1d);
return result;
    }
}
/*

    2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
 */