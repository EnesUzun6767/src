package day00_Test;

import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {
        String str="abcde12345!@#$";
        char[]ch=str.toCharArray();
        String numbers="",letters="",specialChar="";
        System.out.println(Arrays.toString(ch));
        for (Character each:ch) {
            if(Character.isDigit(each)){
                numbers+=each;
            }else if(Character.isLetter(each)){
                letters+=each;
            }else{
                specialChar+=each;
            }
            
        }
        char[]number=numbers.toCharArray();
        char[]letter=letters.toCharArray();
        char[]special=specialChar.toCharArray();
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(letter));
        System.out.println(Arrays.toString(special));
       int sum=0;
        for (char c : number) {
            sum+=c-'0';//good to know.
        }
        System.out.println(sum);
    }

}
