package day25_CustomMethod_Overloading;

import Utility.StringUtility;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str="Java Programming Language";
        StringUtility.printEachChar(str);
        str=StringUtility.reverse(str);
        System.out.println(str);
        String word="leveL";
        boolean palindrome=StringUtility.isPalindrome(word);
        System.out.println(palindrome);

        String[]names={"Anna","Java","Civic","racecar","Mom"};
        int count=0;
        for (String each:names) {
            if (StringUtility.isPalindrome(each)) {
                count++;

            }
        }
        System.out.println(count);


        String[]str1={"Java","is","good"};
        str1=Task6Reverse.reversed(str1);
        System.out.println(Arrays.toString(str1));



        String str3="aaaabbbbcxxxsss";
        str3=StringUtility.removeDuplicates(str3);
        System.out.println(str3);
    }
}
