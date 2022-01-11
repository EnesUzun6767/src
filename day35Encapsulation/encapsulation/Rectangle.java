package day35Encapsulation.encapsulation;

public class Rectangle {
    private double width,length;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public void setWidth(double width) {
        if(width<=0){
            return;
        }
        this.width = width;
    }

    public void setLength(double length) {
        if (length<=0){}
        this.length = length;
    }
    public double calcArea(){
        double area=length*width;
        return area;
    }
    public double calcPerimeter(){
        double perimeter=2*(length+width);
        return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
2. Rectangle Task:
		2.1 Create a class named Rectangle:
				Private variables:
					width, length

				Encapsulate all the fields
						Conditions:
							width of the rectangle should be negative
							length of the rectangle should be negative

				Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of rectangle
					calcPerimeter(): returns the perimeter of rectangle
					toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement
 */
