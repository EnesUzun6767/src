package day29_ArrayList_Continue;

import Utility.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class BreakfastTask3SpecialChars {
    public static void main(String[] args) {
        String str="ABCD123$%#@&456EFG!";
       char []array=str.toCharArray();
        System.out.println(Arrays.toString(array));
        ArrayList<Character>list1=new ArrayList<>();
        ArrayList<Character>list2=new ArrayList<>();
        ArrayList<Character>list3=new ArrayList<>();
        for (char each:array) {
           if( Character.isDigit(each)){
               list1.add(each);
           }
        }
        System.out.println(list1);

        for (char each:array) {
            if(Character.isLetter(each)){
                list2.add(each);
            }
        }
        System.out.println(list2);
        for (char each:array){
            if (!(Character.isLetterOrDigit(each))){
                list3.add(each);
            }
        }
        System.out.println(list3);
    }
}
/*
3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */