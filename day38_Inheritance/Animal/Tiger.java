package day38_Inheritance.Animal;

public class Tiger extends Animal{
    public Tiger(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+" is hunting and eating");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
