package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Phyton");
        list.add("C#");
        list.add("C++");
        list.add("Ruby");
        ArrayList<String>uniques=new ArrayList<>();
        for(String each:list){
          if(list.indexOf(each)==list.lastIndexOf(each) ){
              uniques.add(each);
          }
        }
        System.out.println(uniques);
boolean r2=list.contains("A");
        System.out.println(r2);
        boolean r1=list.contains("Z");
        System.out.println(r1);

        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);
        ArrayList<Integer>list2=new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);
        System.out.println(list1==list2);//false
        System.out.println(list1.equals(list2));//true
list1.clear();
boolean r=list1.isEmpty();
        System.out.println(r);
        ArrayList<Integer>numbers=new ArrayList<>();
        //Bulk Operation:Collection Type
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numbers);
    }
}
