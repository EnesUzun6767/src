package Utility;

public class StringUtility {
    //prints each character of given String
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");

        }

    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String str) {
        return reverse(str).equalsIgnoreCase(str);

    }

    //removes the duplicates from given string, returns String.
    public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }

        }

        return result;


    }
}