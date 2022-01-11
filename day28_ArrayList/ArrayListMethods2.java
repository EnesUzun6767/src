package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
       // Integer num2=200;
        //list.remove(num2);
        System.out.println(list);
        System.out.println();
        list.clear();//removes everthing
        System.out.println(list.size());
        System.out.println(list);
        System.out.println();

        ArrayList<Character>characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('A');
        characters.add('B');
        System.out.println(characters.indexOf('A'));
        System.out.println(characters.lastIndexOf('A'));

    }
}
