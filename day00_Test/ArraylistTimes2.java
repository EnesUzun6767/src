package day00_Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistTimes2 {
 public static ArrayList<Integer> timesTwo(ArrayList<Integer> list) {

     for (int i = 0; i < list.size(); i++) {
        list.set(i,list.get(i)*2);
     }
return list;
     }

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        timesTwo(list);
        System.out.println(list);
    }
 }