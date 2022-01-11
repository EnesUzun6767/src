package day35Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {
        Person p1=new Person();

       p1.setName("Enes"); //     p1.name="Enes";  does not work
        p1.setAge(38);//  p1.age="38";  does not work
        System.out.println(p1.getName()+" : "+p1.getAge());
        // System.out.println(p1.name()+" : "+p1.age());
    }
}
