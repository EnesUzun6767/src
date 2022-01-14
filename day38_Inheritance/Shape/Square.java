package day38_Inheritance.Shape;

public class Square extends Shape{
    public double side;

    public Square( double side) {
        super("square");
        this.side = side;
    }


    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return super.toString()
                +"\t"+" side="+side;
    }
}
/*
 Square
        s

        toString(): name, s, area, perimeter
 */