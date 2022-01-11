package day35Encapsulation.encapsulation;

public class Circle {
    private double radius;
    public static double pi=3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            return;
        }
        this.radius = radius;
    }
    public void calcArea(){

        System.out.println(radius*radius*pi);
    }
    public void calcPerimeter(){
        System.out.println(2*radius*pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + radius*radius*pi +
                "perimeter=" + 2*radius*pi +
                '}';
    }
}
/*
2. Create a class named Circle

            private variables:
                radius

            public variable:
                pi

             Encapsulate all the private fields

                     1. radius of the circle can not be zero or negative

             Add a constructor that can set the radius of circle when circle object is created

             Methods:
                 calcArea()
                 calcPerimeter()
                 toString()
 */