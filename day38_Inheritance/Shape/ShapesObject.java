package day38_Inheritance.Shape;

public class ShapesObject {
    public static void main(String[] args) {
        Square square=new Square(3);
        square.area();
        square.perimeter();
        Rectangle rectangle=new Rectangle(3,6);
        rectangle.area();
        rectangle.perimeter();
        Circle circle=new Circle(2);
        circle.area();
        circle.perimeter();
        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);
    }
}
