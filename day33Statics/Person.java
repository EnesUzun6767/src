package day33Statics;

public class Person {
public String name;
public int age;
public char gender;
public static void  isHuman(){
    System.out.println(true);
}
public static boolean hasNose(){
    return true;
}
public static void hasWings(){
    System.out.println(false);
}
public static void numberOfHead(){
    System.out.println("one");
}

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
3. Person Task:
		1. Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()

 */