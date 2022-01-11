package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aaabbcddseerttyuui";
        String[] arr=str.split("");

        ArrayList<String>list=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        ArrayList<String>uniques=new ArrayList<>(list);
        uniques.removeIf(s -> Collections.frequency(list,s)>1);
        System.out.println(uniques);//as an array list;

        String uniques1="";
        for (String each:uniques) {
            uniques1+=each;
        }
        System.out.println("uniques:"+uniques1);//as a string;

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        ArrayList<String>unq=new ArrayList<>();

        for(String each:list){
            int count=Collections.frequency(list,each);
            if(count==1){
                unq.add(each);
            }
        }
        System.out.println(unq);


    }
}
