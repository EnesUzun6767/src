package day39Recap.Animal;

public class Tiger extends WildAnimal {
    public Tiger(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }



    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting");
    }
}
