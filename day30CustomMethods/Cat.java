package day30CustomMethods;

public class Cat {
    public String name;
    public int age;
    public String breed;
    public char gender;
    public String color;
    public String size;

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
    public void paws(){System.out.println(size+" is a huge cat");}
    public void setInfo(String name, int age, String breed, char gender, String color, String size) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;


    }
}
