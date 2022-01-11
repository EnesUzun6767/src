package day34_GarbageCollection_AccesModifiers;

public class Person {
    public String name,language;
    public char gender;
    public static String planet;
    public static boolean isHuman,hasNose;
    public static int numberOfWings,numberOfHead;
    static {
        isHuman=true;
        hasNose=true;
        numberOfHead=1;
        numberOfWings=0;
    }

    public Person(String name, String language, char gender) {
        this.name = name;
        this.language = language;
        this.gender = gender;
    }
    public static void planetName(){
        System.out.println("Earth");
    }
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public void  drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", gender=" + gender +
                '}';
    }

    public static void main(String[] args) {
        Person person1=new Person("Kazim","Turkish",'M');
        planetName();
        person1.drink("tea");
        person1.eat("kepab");
        System.out.println("Has nose: "+Person.hasNose);
        System.out.println("Is Human: "+Person.isHuman);
        System.out.println("Has: "+Person.numberOfHead+" head");
        System.out.println("Has: "+Person.numberOfWings+" wings");

    }
}

/*
Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()
 */