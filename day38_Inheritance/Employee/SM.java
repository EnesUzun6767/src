package day38_Inheritance.Employee;

public class SM extends Employee{
    public SM(String name, String id, String companyName, int age, double salary) {
        super(name, id, "Scrum Master", companyName, age, salary);
    }

    @Override
    public void work() {
        System.out.println("working as an SM");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
