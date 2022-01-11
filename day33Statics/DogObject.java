package day33Statics;

public class DogObject {
    public static void main(String[] args) {
        Dog dog1=new Dog("Doberman","large",'M',3,"black");
        System.out.println(dog1);
        System.out.println(Dog.isFriendly);
        System.out.println(Dog.getNumberOfEyes);
        System.out.println(Dog.numberOfLegs);
    }
}
