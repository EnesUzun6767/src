package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);//index 0
        numbers.add(20);//index 1
        numbers.add(30);//index 2
        numbers.add(40);//index 3
        numbers.add(50);//index 4
        numbers.add(60);//index 5

        numbers.add(2,25); // numbers moved to the right
        System.out.println(numbers);
        int lastIndex=numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);
      int num= numbers.get(3);// at index 3 we get the value.
        System.out.println("num = " + num);
        System.out.println("                                       ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("                                       ");
        ArrayList<String>list=new ArrayList<>();
        list.add("Java");
        list.add("Phyton");
        list.add("C#");
        list.add("Java");
        list.add("Ruby");
        System.out.println(list);
        list.set(2,"JavaScript");
        System.out.println(list);
        list.set(3,"Fortran");
        System.out.println(list);
        ArrayList<String>employees=new ArrayList<>();
        employees.add("Enes");
        employees.add("Samet");
        employees.add("Ahmet");
        employees.add("Enes");
        employees.add("Warto");
        System.out.println(employees);
        employees.remove("Enes");
        employees.remove(3);
        System.out.println(employees);
        employees.remove(2);
        System.out.println(employees);
employees.remove(employees.size()-1);
        System.out.println(employees);
        employees.remove("Enes");//By object

    }
}
