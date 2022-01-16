package day39Recap.Animal;

public class Dog extends FriendlyAnimal{
    public Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating");
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping");
    }

    @Override
    public void move() {
        System.out.println(getName()+" is moving");
    }


    @Override
    public void play() {
        System.out.println(getName()+" is playing well");
    }

    @Override
    public void pet() {
        System.out.println(getName()+ "is my lovely pet" );
    }
}
