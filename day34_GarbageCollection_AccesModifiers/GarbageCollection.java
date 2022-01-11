package day34_GarbageCollection_AccesModifiers;

import day30CustomMethods.Dog;
import day31_CustomClass_Constructor.Student;
import day32Constructor.Car;
import day33Statics.Iphone;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
   /*
      //  int n = null;
        String str=null;
        System.out.println(str.toUpperCase());
*/
        String str="Wooden Spoon";//after line 11 "Wooden Spoon" will be eligible for garbage collection.
        str=null;
        System.out.println(str);
       Car car1=new Car("Toyota");
       car1=null;
        System.out.println(car1);

        System.out.println("---------------------------------------------------");
        Dog dog1=new Dog();
        dog1.name="Lucky";
        dog1=new Dog();
        dog1.name="Max";
        System.out.println(dog1);
String language="Phyton";//un referenced
       language="Java";
        System.out.println(language);
        System.out.println("---------------------------------------------------");
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(100);
        ArrayList<Integer>list2=list1;
        list2.addAll(Arrays.asList(200,100,400));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2);
        System.out.println("---------------------------------------------------");
        Student student1=new Student("Tahir",30,'M',13);
        Student student2=student1;
        student1.grade='A';
        student2.name="Ahmet";
        System.out.println(student1);
        System.out.println(student2);
        System.out.println("---------------------------------------------------");
        ArrayList<String>l1=new ArrayList<>();
        l1.add("Java");
        ArrayList<String>l2=l1;
        l2.add("Phyton");
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
        
        

    }
}

