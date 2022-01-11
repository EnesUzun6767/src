package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6};
        int[]reversed=new int[array.length];
        for (int i = array.length-1,j=0; i >=0 ; i--,j++) {
            reversed[j]=array[i];
        }
        System.out.println(Arrays.toString(reversed));
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>reversedList=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));

        for (int i= list.size()-1; i>=0; i--) {
            int each=list.get(i);
            reversedList.add(each);
        }
        System.out.println(Arrays.toString(reversed));
    }
}
