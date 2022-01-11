package day01_JavaIntro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        String str = "abaaaaaccccbbb";
        String s1=repatingChar(str);
        System.out.println(s1);
    }
        public static String repatingChar(String str){
            String nonDup = "";
            for (int i = 0; i < str.length(); i++) {
                String ch = "" + str.charAt(i);
                if (!(nonDup.contains(ch))) {
                    nonDup += ch;
                }

            }
            System.out.println(nonDup);
            String result = "";
            for (int i = 0; i < nonDup.length(); i++) {
                String general = "" + nonDup.charAt(i);
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    String each = "" + str.charAt(j);
                    if (general.equals(each)) {
                        count++;
                    }
                }
                result += count + general;

            }
            return  result;
        }
    }