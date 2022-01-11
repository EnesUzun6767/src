package day00_Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InterviewQuestionfrequency {
    public static void main(String[] args) {
        String s1 = "aaabbbcccgggsssf";
        String onces="";
        for (int i = 0; i < s1.length(); i++) {
            String each=""+s1.charAt(i);
            if(!(onces.contains(each))){
                onces+=each;
            }
            }
        char[] onces1=onces.toCharArray();
            ArrayList<Character>list2=new ArrayList<>();
            for (int j = 0; j < onces1.length; j++) {
                list2.add(onces1[j]);
        }
            System.out.println(list2);
        ArrayList<Character>list=new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch=s1.charAt(i);
            list.add(ch);
        }
        System.out.println(list);
        for (Character charachter: list2) {
            System.out.print(charachter+""+Collections.frequency(list,charachter) ) ;
        }

    }
}
