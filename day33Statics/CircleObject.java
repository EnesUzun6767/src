package day33Statics;

public class CircleObject {
    public static void main(String[] args) {
        Circle circle1=new Circle(2.5,5);
        System.out.println(circle1);
        Circle.printPi();
        System.out.println(circle1.calcPerimeter());
        System.out.println(circle1.calcArea());
    }
}
