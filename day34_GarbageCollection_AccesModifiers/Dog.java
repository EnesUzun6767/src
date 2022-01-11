package day34_GarbageCollection_AccesModifiers;

public class Dog {
    public String breed,size ,color;
    public int age;
    public static int  numberOfLegs,numberOfEyes,numberOfWings;
    public boolean isFriendly;

    public Dog(String breed, String size, String color, int age, boolean isFriendly) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.isFriendly = isFriendly;
    }
    static {
        numberOfEyes=2;
        numberOfLegs=4;
        numberOfWings=0;
    }
    public void eat(){
        System.out.println(breed+" is eating ");
    }
    public void drink(){
        System.out.println(breed+" is drinking");
    }
    public void sleep(){
        System.out.println(breed+" is sleeping");
    }
    public void play(){
        System.out.println(breed+" is playing");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", isFriendly=" + isFriendly +
                '}';
    }

    public void bark(){
        System.out.println(breed+"  is barking");

    }

    public static void main(String[] args) {
        Dog dog1=new Dog("Karabas","Large","black",4,true);
        dog1.bark();
        dog1.drink();
        dog1.eat();
        dog1.sleep();
        System.out.println(" has "+Dog.numberOfEyes+" eyes");
        System.out.println(" has "+Dog.numberOfLegs+" legs");
        System.out.println(" has "+Dog.numberOfWings+" wings");
    }
}
/*
1. Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */