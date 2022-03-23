package day47_Polymorphism;

import day43_Abstraction.Employee.Employee;
import day43_Abstraction.Employee.Person;
import day43_Abstraction.Employee.Tester;
import day44_Abstraction_ME.animal.Animal;
import day44_Abstraction_ME.animal.Cat;
import day44_Abstraction_ME.animal.Dog;
import day45_Abstract_Interface.Shape.Circle;
import day45_Abstract_Interface.Shape.Shape;
import day45_Abstract_Interface.Shape.Square;

public class ReferanceTypeCasting {
    public static void main(String[] args) {
        Shape shape=new Circle(4);//upcasting
Shape shape2=new Circle(5);
        Animal animal=new Dog("Max","Huskey",'M',3,"Small","White");
       Dog dog1=new Dog("Lucy","Huskey",'M',3,"Small","White");
        Dog dog= (Dog) animal;
        System.out.println("animal = " + animal.getName());
        System.out.println("dog= " + dog.getName());
        ((Dog) animal).bark();// animal.bark(); error

        dog.bark();
        dog1.bark();
         Shape shape1=new Square(5);
        System.out.println("shape1 = " + ((Square) shape1).getSide());

        System.out.println("---------------------------------------------------");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

        //Cat cat = (Cat) animal2;
        // cat.meow();
        ( (Cat) animal2 ).meow();

        // ( (Dog) animal2 ).bark();

        System.out.println("---------------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);

        ( (Tester)employee ).bugReport();

        //  ( (Tester)employee ).unitTest();

        //  ( (Developer)employee ).unitTest();

        //  Driver driver = (Driver) employee;  // line 1
        Person person = (Person) employee; // line 2
        //    Teacher teacher = (Teacher) employee; // line 3

        System.out.println("----------------------------------------------------");

        Shape s1 = new Circle(10);
        System.out.println("s1.area() = " + s1.area());//circle method is written as an answer
        System.out.println("s1.perimeter() = " + s1.perimeter());//circle method is written as an answer

        //  ( (Cube)s1 ).volume();
    }
}
