package day39Recap.Animal;

public class WildAnimal extends Animal {
    static {
         boolean isWild=true;
         boolean isFriendly=false;
         boolean isPlayable=false;
     }

    public WildAnimal(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }



    public void hunt() {}

    }

/*
Create a subclass of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */