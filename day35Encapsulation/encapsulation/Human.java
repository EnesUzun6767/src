package day35Encapsulation.encapsulation;

public class Human {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Human(String name, char gender, int age, double salary) {
       setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name) {
if(name.isEmpty()){
    System.out.println("Invalid name ");
    return;
}
        this.name = name;
    }

    public void setGender(char gender) {
        if(!(gender=='M'|| gender=='F')){
            System.out.println("Invalid gender");
            return;
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Human h1=new Human("Ahmet Mustafa",'M',29,120000);
        System.out.println(h1);
        h1.setName("Ahmet");
        h1.setAge(12);
        h1.setSalary(120000);
        h1.setGender('S');
        h1.setGender('M');
        System.out.println(h1.getAge());
        System.out.println(h1);

    }
}
