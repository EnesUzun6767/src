package day38_Inheritance.Animal;

public class Cat extends Animal{


    public Cat(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+" is eating milk");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

