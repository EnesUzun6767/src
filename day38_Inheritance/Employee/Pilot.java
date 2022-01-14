package day38_Inheritance.Employee;

public class Pilot extends Employee{
    public Pilot(String name, String id, String jobTitle, String companyName, int age, double salary) {
        super(name, id, jobTitle, companyName, age, salary);
    }

    @Override
    public void work() {
        System.out.println(name+" is working as a driver in"+companyName);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
