package day31_CustomClass_Constructor;

public class PersonObject {
    public static void main(String[] args) {
        Person person1=new Person("Enes",'M',37);
        System.out.println(person1);
        Person person2=new Person("Semra",'F',37);
        System.out.println(person2);
        person2.age = 30;
        System.out.println(person2);
    }
}
