package day31_CustomClass_Constructor;

public class Person {   //class
    public String name;
    public char gender;
    public int age;
public Person(String name,char gender,int age){     //constructors
    this.name=name;
    this.gender=gender;
    this.age=age;
}
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
