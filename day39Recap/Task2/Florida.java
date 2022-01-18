package day39Recap.Task2;

public class Florida extends States{
    public Florida(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    @Override
    public void payTax() {
        super.payTax();
    }
}
