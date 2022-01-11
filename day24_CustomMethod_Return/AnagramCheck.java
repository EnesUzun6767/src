package day24_CustomMethod_Return;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String word1="Oh my Dear,  Forget your Fear,  Let all your Dreams be Clear,  Never put Tear";
        String word2="Please Hear,I want to tell one thing in your Ear… Wishing you a Very Happy New Year!";
        String result=anagramCheck(word1,word2);
        System.err.println(result);

    }
    public static String anagramCheck(String str1,String str2){
      String result="";
      char[]array1=str1.toCharArray();
      char[]array2=str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        if(Arrays.equals(array1, array2)){
            result=str1+" and "+str2+" are anagram";
        }else{
            result=str1+"and"+str2+" are not anagram";
        }
        return result;
    }
}
