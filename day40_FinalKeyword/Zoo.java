package day40_FinalKeyword;

public class Zoo {
    public static void main(String[] args) {


        Dog dog = new Dog("Max", "Huskey", 'M', "white", "large", 3);
        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());
        dog.drink();
        dog.bark();

    }
}