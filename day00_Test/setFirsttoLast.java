package day00_Test;

import java.util.ArrayList;
import java.util.Arrays;

public class setFirsttoLast {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        list.set(4,0);//index no ,object
        System.out.println(list);
        System.out.println("1st element: "+list.get(0));
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)*2);
        }
        System.out.println(list);
        int a =0;
        for (int each:list) {
            list.set(a++,each*2);
        }
        System.out.println(list);

ArrayList<Integer>list2=new ArrayList<>();
list2.addAll(Arrays.asList(1,3,45,7,8,9,10,11,13));
        for (int i = 0; i < list2.size(); i++) {
            if(list2.get(i)%2==1){
                list2.set(i, list2.get(i)*2);
            }
        }
        System.out.println(list2);

        ArrayList<Integer>list3=new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,4,5,6,7,8,9,9,12,12));
        System.out.println(list3);


        for(Integer each:list3){
            int i=0;
            for (Integer each1:list3) {
                if(each==each1){
                    i++;
                }
                }
            if(i==2){
                    System.out.println(each);
                    break;

            }
        }
        }

    }

/*1. write a program that can set the last element of the Integer arraylist to zero
        ex:
        list = [1,2,3,4,5];
        output: [1,2,3,4,0];
3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]
 */
