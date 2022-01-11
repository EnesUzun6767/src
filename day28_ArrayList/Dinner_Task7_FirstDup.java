package day28_ArrayList;

import java.util.ArrayList;

public class Dinner_Task7_FirstDup {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        int count = 0;
        for (int each : list) {
            for (int reach : list) {
                if (each == reach) {
                    count++;
                }
                while (count == 2) {
                    System.out.println("first duplicated list: " + each);
                    break;
                }
            }
        }
    }
}