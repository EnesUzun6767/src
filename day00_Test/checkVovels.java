package day00_Test;

import java.util.Locale;

public class checkVovels {
    public static void main(String[] args) {
        String vovels="aeiou";
        String word="HellowORD";
        boolean result=false;
        word=word.toLowerCase(Locale.ROOT);
        for (int i = 0; i < vovels.length(); i++) {
            char ch=vovels.charAt(i);
            for (int j=0;j<word.length();j++){
                char ch1=word.charAt(j);
                if(ch==ch1){
                    result=true;
                }
                }
            }
        System.out.println(result);
        String[] vovels1 = {"a","e","o","u","i"};
        String str="jkfhdsfsAB";
        boolean result1=false;
        for(String each:vovels1){
            if (str.toLowerCase().contains(each)) {
                result1=true;
            }
        }
        System.out.println(result1);
    }
}
