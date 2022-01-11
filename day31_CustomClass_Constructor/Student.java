package day31_CustomClass_Constructor;

public class Student {
    public String name;
    public int age;
    public char grade;
    public int id;

    public Student(String name, int age, char grade, int id) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.id = id;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", id=" + id +
                '}';
    }
}
