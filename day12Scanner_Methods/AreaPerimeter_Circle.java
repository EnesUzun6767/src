package day12Scanner_Methods;

import java.util.Scanner;

public class AreaPerimeter_Circle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a radius value");
        double radius=scan.nextDouble();
        double area=3.14*radius*radius;
        double perimeter=2*3.14*radius;

        System.out.println("Area of circle is: "+area+"\nPerimeter of circle is:"+perimeter);

scan.close();

    }
}
