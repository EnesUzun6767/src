package day31_CustomClass_Constructor;

public class StudenttObject {
    public static void main(String[] args) {
        Student student1=new Student("Enes",37,'A',123456);
        System.out.println(student1);

        Student student2 = new Student("Ali",30,'M',42);
        System.out.println(student2);
    }
}
