package day29_ArrayList_Continue;

import java.util.ArrayList;

public class Max_Min_Avarage {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>()  ;
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(11);
        list.add(8);
        list.add(5);
        list.add(28);
        list.add(11);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list);
        int max=list.get(0);
        int min=list.get(1);
        for (Integer each : list) {
            if(each>max){
                max=each;
        }

        }
        for (Integer each : list) {
            if(each<min){
                min=each;
            }
        }
        double sum=0;
        for (Integer each : list) {
            sum+=each;
        }
        double avarage=sum/list.size();

        System.out.println("avarage = " + avarage);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
