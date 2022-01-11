package day37_Inheritance.animal;

public class Cat extends Animal {
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void scrath(){
        System.out.println(name+" is scratching");
    }
}
