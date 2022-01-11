package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniquesElements2 {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,1,3,1,4,3,5,6,7,8));

        ArrayList<Integer>uniques=new ArrayList<>(list1);
        uniques.removeIf(each ->Collections.frequency(list1, each)>1);
        System.out.println(uniques);

        //2nd solution

        ArrayList<Integer>list5=new ArrayList<>();
        for (Integer each:list1) {
            int count=Collections.frequency(list1,each);
            if(count==1){
                list5.add(each);
            }

        }
        System.out.println("uniques arraylist: " + list5);

    }
}
