package day21_ForEachLoop;

import javax.swing.plaf.IconUIResource;

public class UniqueElements {
    public static void main(String[] args) {
        String[]names={"enes","enes","enes","semra","ahmet","semra"};

        for (String name : names) {
            int count=0;
            for (String each : names) {
                if(each.equals(name)){
                    count++;
            }
                }
            if(count==1){
                System.out.println(name);
            }
        }

        int freq=0;
        for (String name2 : names) {
            if(name2.equals("enes")){
                freq++;
            }

        }
        System.out.println("enes repeats: "+freq);
    }
}