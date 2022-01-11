package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(40);
        list.add(50);
        ArrayList<Integer>noNDup=new ArrayList<>();
        for(Integer each:list){
            if (!(noNDup.contains(each))){
                noNDup.add(each);
            }
        }
        System.out.println(noNDup);
    }
}
