package day00_Test;

import java.util.ArrayList;
import java.util.Arrays;

public class kahoot {
    public static void main(String[] args) {
        String word = "1436abc";
        ArrayList<Character>numbers=new ArrayList<>();
        ArrayList<Character>letters=new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            Character each = word.charAt(i);
            if (each.isDigit(each)) {
                numbers.add(each);
                System.out.print(each + " is digits ,");
            } else {
                letters.add(each);
                System.out.println(each + " are letter");
            }
        }
        System.out.println(numbers);
        System.out.println(letters);

        String value="12345";
        Integer num=Integer.parseInt(value);
        System.out.println(num);
        int num1=Integer.parseInt(value);
        System.out.println(num1);

        int num2=Integer.valueOf(value);
        System.out.println(num2);


        String str="abcd1234";
        int sum=0;
        char[] characters=new char[0];
       characters= str.toCharArray();
        System.out.println(Arrays.toString(characters));
        for (char each : characters) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
                System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}


