package day29_ArrayList_Continue;

import Utility.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
list.removeIf(integer -> integer<5);
        System.out.println(list);
        list.removeIf(integer -> integer%2==0);
        System.out.println(list);

ArrayList<String> named =new ArrayList<>();
named.addAll(Arrays.asList("Anna","Racecar","Cevel","Eye","Cydeo","Java"));
named.removeIf(each ->each.startsWith("C") );
        System.out.println(named);



ArrayList<String>names=new ArrayList<>();
names.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Cydeo","Java"));
names.removeIf(name -> StringUtility.isPalindrome(name));
        System.out.println(names);
    }
}
