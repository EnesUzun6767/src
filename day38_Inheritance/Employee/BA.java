package day38_Inheritance.Employee;

public class BA extends Employee{
    public BA(String name, String id,  String companyName, int age, double salary) {
        super(name, id, "BA", companyName, age, salary);
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
