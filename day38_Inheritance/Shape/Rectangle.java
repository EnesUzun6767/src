package day38_Inheritance.Shape;

public class Rectangle extends Shape {
    public double length,width;

    public Rectangle( double length, double width) {
        super("rectangle");
        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return super.toString()
                +"\t"+"length= "+length
                +"\t"+"width= "+width;
    }
}
