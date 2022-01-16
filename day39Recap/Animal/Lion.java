package day39Recap.Animal;

public class Lion extends WildAnimal  {
    public Lion(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }


    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting");
    }
}
