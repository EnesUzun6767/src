package day30CustomMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DogObject {
    public static void main(String[] args) {
       Dog dog1 =new Dog();
       dog1.name="Lucy";
       dog1.breed="Husky";
       dog1.age=5;
       dog1.gender='F';
        dog1.size="Small";
       dog1.color="White";
        System.out.println(dog1);
        Dog dog2=new Dog();
        dog2.name="Lucky";
        dog2.breed="Husky";
        dog2.age=4;
        dog2.gender='M';
        dog2.size="Large";
        dog2.color="Black";
        System.out.println(dog2);
Dog dog3=new Dog();
dog3.setInfo("Kadife","Rusty",6,'M',"Xlarge","Brown");
        System.out.println(dog3);
        dog1.eat();
        dog2.bark();
        Dog dog4=new Dog();
        dog4.setInfo("Ann","Labrador",3,'M',"Extra large","Yellow");
        Dog dog5=new Dog();
        dog5.setInfo("Sully","Pit-Bull",6,'M',"Large","Black");

        ArrayList<Dog>dogs=new ArrayList<>();
       dogs.addAll(Arrays.asList(dog1,dog2,dog4,dog5));

        ArrayList<Dog>female=new ArrayList<>(dogs);
        ArrayList<Dog>male=new ArrayList<>(dogs);
       female.removeIf(s->s.gender=='M');
        male.removeIf(s->s.gender=='F');
        System.out.println("female: "+female);
        System.out.println("male: "+male);
        int numFemale= female.size();
       int numMale=male.size();
        System.out.println("numMale = " + numMale);
        System.out.println("numFemale = " + numFemale);

    }
}
