package day45_Abstract_Interface.Shape;

public class Circle extends Shape{
    private double radius;
   public final static double pi=3.14;

    public Circle( double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0){
            throw  new RuntimeException("Invalid radius"+radius);
        }
        setRadius(radius);
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" +getName() + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter()+ '\'' +
                "radius=" + radius +
                '}';
    }
}

