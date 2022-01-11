package day00_Test;

import java.util.ArrayList;
import java.util.Arrays;

public class EskiMeyenYontem {
    public static void main(String[] args) {
        String str="abcasde123456789";
        ArrayList<Integer>numbers=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch>='0'&&ch<='9'){
                numbers.add(ch-'0');
            }
        }
        System.out.println(numbers);
        ArrayList<Character>number=new ArrayList<>();
int sum=0;
       char[]characters=str.toCharArray();
       for(char ch:characters){
           if(Character.isDigit(ch)){
              number.add(ch);
              sum+=ch-'0';
           }
        }
        System.out.println(number);
        System.out.println(sum);
    }


}
