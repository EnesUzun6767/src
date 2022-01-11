package day33Statics;

public class Dog {
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;
    public static int numberOfLegs=4;
    public static int getNumberOfEyes=2;
    public static boolean isFriendly=true;

    public Dog(String breed, String size, char gender, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
    public void  eat(){
        System.out.println(breed+"is eating");
    }
    public  void  sleep(){
        System.out.println(breed+" is sleeping");
    }
    public void play(){
        System.out.println(breed+"is playing");
    }

}
/*
6. Dog Task:
		1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()
 */