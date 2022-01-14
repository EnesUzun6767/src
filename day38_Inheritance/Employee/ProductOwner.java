package day38_Inheritance.Employee;

public class ProductOwner extends Employee {
    public ProductOwner(String name, String id, String companyName, int age, double salary) {
        super(name, id, "Product Owner", companyName, age, salary);
    }

    @Override
    public void work() {
        System.out.println("working as a Product Owner in"+companyName);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
