package day24_CustomMethod_Return;

import java.util.Locale;

public class NameRegularForm {
    public static void main(String[] args) {
       String word1="numb3rS";
       String word2="tImE";
       String result=RegularName(word1,word2);
        System.out.println(result);
    }
    public static String RegularName(String str1,String str2){
        String result="\""+str1.toUpperCase(Locale.ROOT).charAt(0)+str1.toLowerCase(Locale.ROOT).substring(1)+"  "+
                str2.toUpperCase(Locale.ROOT).charAt(0)+str2.toLowerCase(Locale.ROOT).substring(1)+"\" ";
        return result;
    }
}
