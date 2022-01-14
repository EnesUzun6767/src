package day38_Inheritance.Shape;

public class Circle extends Shape {
    public double radius;

    public Circle( double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return super.toString()
        +"\t"+"radius="+radius;
    }
}
