package day37_Inheritance.ScrumTeam;

public class ProductOwner extends Employee {
    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "ProductOwner", id, salary, companyName);
    }
}
