package day35Encapsulation.encapsulation;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            return;
        }
        this.side = side;
    }

    public Square(double side) {
    setSide(side);
    }
    public double calcArea(){
      double area=side*side;
      return area;
    }
    public double calcPerimeter(){
        double perimeter=4*side;
        return perimeter;
    }


    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + calcArea()+
                "perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
1. Square Task:
		1.1 Create a class named Square:
				Private variables:
					side

				Encapsulate all the fields

					Condition:
						side of the Square should be negative

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of Square
					calcPerimeter(): returns the perimeter of Square
					toString(): can display the side, area, perimeter of Square when object is passed in print statement
 */