package day33Statics;

public class PersonObject {
    public static void main(String[] args) {
        Person person1=new Person("Enes",37,'M');
        System.out.println(person1);
        System.out.println(Person.hasNose());
        Person.hasWings();
        Person.isHuman();
        Person.numberOfHead();
    }

}
