package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        /*
        Create a class named Circle, write a program
        that can calculate the area & perimeter of any given Circle
         */
        double PI=3.14;
        double radius=3.2;
        double perimeter =2*3.14*radius;
        double area=PI*radius*radius;
        double diameter=2*radius;

        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }
    // PI=3.14

}
