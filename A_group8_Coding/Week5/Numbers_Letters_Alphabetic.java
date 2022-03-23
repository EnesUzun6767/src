package A_Group_8_Java_Coding.Week5;

import java.util.ArrayList;
import java.util.Arrays;

public class Numbers_Letters_Alphabetic {
    public static void main(String[] args) {
        String a = "DC501GCCCA098911";
        String b = translate(a);
        System.out.println(b);

    }

    public static String  translate(String a) {
        ArrayList<String> list1 = new ArrayList<>();
        String result = "";
        String result1 = "";
        for (int i = 0; i < a.length() - 1; i++) {
            //getting only letter part and adding to result String
            if (Character.isLetter(a.charAt(i)) && (Character.isLetter(a.charAt(i + 1)) || Character.isDigit(a.charAt(i + 1)))) {
                result += a.charAt(i) + "";
            }
            //special character adding to string to use in the next steps for splitting
            if (Character.isLetter(a.charAt(i)) && (Character.isDigit(a.charAt(i + 1)))) {
                result += "@";
            }
            //getting only digits part and adding to result String
            if ((Character.isDigit(a.charAt(i)) && (Character.isLetter(a.charAt(i + 1)) || Character.isDigit(a.charAt(i + 1))))) {
                result += a.charAt(i) + "";
            }
            //special character adding to string to use in the next steps for splitting
            if (Character.isDigit(a.charAt(i)) && (Character.isLetter(a.charAt(i + 1)))) {
                result += "@";
            }

        }
        //adding last character in this step
        result += a.charAt(a.length() - 1);
        //splitting by  @
        String arr[]=result.split("@");
        for (String each : arr) {
            char[] chars = each.toCharArray();
            //sorting each part
            Arrays.sort(chars);
            for(char eachChar: chars){
                result1 +=""+eachChar;
            }
        }
        return result1;
    }

}
/*
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
Ex:
Input: "DC501GCCCA098911" OutPut: "CD015ACCCG011899"
 */