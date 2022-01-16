package day39Recap.Animal ;

public class FriendlyAnimal extends Animal {

static {
    boolean isWild=false;
    boolean isFriendly=true;
    boolean isPlayable=true;
}

    public FriendlyAnimal(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }


   public void play(){}
    public void pet(){}


    }


/*

	2. Create a subclass of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */