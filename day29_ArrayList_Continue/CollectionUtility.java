package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(10,9,7,3,1,8,12,15));

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
Collections.swap(list,0,1);
        System.out.println(list);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        ArrayList<Character>list2=new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));
        Collections.reverse(list2);
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        Collections.swap(list3, 4, 1 );

        System.out.println(list3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
       int max= Collections.max(list3);
       int min= Collections.min(list3);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,10, 20, 30, 40, 50, 60, 70));
        Collections.replaceAll(list4,10,35);
        System.out.println("list4 = " + list4);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        int frequency=Collections.frequency(list4,35);
        System.out.println("frequency = " + frequency);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    ArrayList<String>words=new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Java","Phyton","Phyton"));
       int freqJava= Collections.frequency(words,"Java");
       int freqPhyton=Collections.frequency(words,"Phyton");
        System.out.println("freqPhyton = " + freqPhyton);
        System.out.println("freqJava = " + freqJava);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,1,3,1,4,3,5,6,7,8));
        ArrayList<Integer>list5=new ArrayList<>();
        for (Integer each:list1) {
            int count=Collections.frequency(list1,each);
            if(count==1){
                list5.add(each);
            }

        }
        System.out.println("uniques arraylist" + list5);

    }
}
