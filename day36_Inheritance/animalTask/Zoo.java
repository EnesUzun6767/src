package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "large", "Husky", "white", 'M', 7);

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        // dog.hunt();
        // dog.scratch();

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin","small","Siyam","black",'M',3);

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        // cat.bark();
        //  cat.hunt();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "large", "Bengal", "white", 'M', 5);

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);


        //  tiger.bark();




    }
}
