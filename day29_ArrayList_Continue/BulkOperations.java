package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));// as list Method covert to collection type.Listed all data
        System.out.println("list = " + list);
        list.removeAll(Arrays.asList(3,4,5));
        System.out.println("list = " + list);
        
        
        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("list1 = " + list1);
        list1.retainAll(Arrays.asList(3,4,5));//keeping those elements in the list;
        System.out.println(list1);
        
        
        ArrayList<String>jobTitles=new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","Developer","QA","Scrum Master","BA"));
        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println("jobTitles = " + jobTitles);
        
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,9,11,12,13,9));
        boolean r1=numbers.contains(11);
        System.out.println("r1 = " + r1);
        boolean r2=numbers.containsAll(Arrays.asList(1,2,3));//true
        System.out.println("r2 = " + r2);
        numbers.removeAll(Arrays.asList(1,2,3));
        System.out.println("numbers = " + numbers);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String[]names={"Josh","Jack","Daniel","Shay","Enes"};
        System.out.println("names array: "+Arrays.toString(names));
       ArrayList<String>namesList=new ArrayList<>(Arrays.asList(names));
       /* namesList.addAll(Arrays.asList(names));*/
        System.out.println("nameList array list: "+namesList);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>( convertArrayToArrayList(arr2) );

        System.out.println("list3 = " + list3);

    }


    public static ArrayList<Integer>  convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;
    }
}
