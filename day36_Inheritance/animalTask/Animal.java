package day36_Inheritance.animalTask;

public class Animal {
    public String name,size,breed,color;
    public char gender;
    public int age;

    public void setInfo(String name, String size, String breed, String color, char gender, int age) {
        this.name = name;
        this.size = size;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void move(){
        System.out.println(name+" is moving");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
