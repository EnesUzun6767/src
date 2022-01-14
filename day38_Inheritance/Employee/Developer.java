package day38_Inheritance.Employee;

public class Developer extends Employee {
    public Developer(String name, String id, String jobTitle, String companyName, int age, double salary) {
        super(name, id, jobTitle, companyName, age, salary);
    }

    @Override
    public void work() {
        System.out.println(name+" is working in "+jobTitle+" as a "+jobTitle);;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
