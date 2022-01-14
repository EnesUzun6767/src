package day38_Inheritance.Employee;

public class Tester extends Employee {

    public Tester(String name, String id, String jobTitle, String companyName, int age, double salary) {
        super(name, id, jobTitle, companyName, age, salary);
    }

    @Override
    public void work() {
        System.out.println(name+"is working as "+jobTitle);
    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
