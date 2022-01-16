package day39Recap.Animal;

public class Dolphin extends FriendlyAnimal{
    public Dolphin(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age, false, true, true);
    }
    public void swim(){
        System.out.println();
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
        System.out.println(getName()+" is playing ball");
    }


}
