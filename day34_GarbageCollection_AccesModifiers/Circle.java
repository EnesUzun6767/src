package day34_GarbageCollection_AccesModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name="Circle";
    public static ArrayList<Integer>numbers;
    public Circle(double radius){
        this.radius=radius;
        //pi=3.14;
    }
    static {
      //  radius=5; not accepted  it is not static
        pi=3.14;
        name="Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }

    /*
    public static void main(String[] args) {   you can not call main method in other main page
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }
*/
}
