package day37_Inheritance.ScrumTeam;

public class BusinessAnalyst  extends Employee{
    public BusinessAnalyst(String name, int age, char gender,  int id, double salary, String companyName) {
        super(name, age, gender, "BusinessAnalyst", id, salary, companyName);
    }
}
