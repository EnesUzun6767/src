package day35Encapsulation.encapsulation;

public class Person {
    private String name;
    private int age;
    public String getName(){//Get the name
        return name;
    }
    public void setName(String name){//Set the name
        this.name=name;

    }

    public int getAge() {//get the age
        return age;
    }
    public void setAge(int age){//set the name
        if(age<=0||age>150){
            System.err.println("Invalid age "+age);
            System.exit(0);
        }


        this.age=age;
    }
}
