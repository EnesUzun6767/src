package day38_Inheritance.Employee;

public class Teacher extends Employee{
    public Teacher(String name, String id,String companyName, int age, double salary) {
        super(name, id,"teacher", companyName, age, salary);
    }

    @Override
    public void work() {
        System.out.println("working as a teacher");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
