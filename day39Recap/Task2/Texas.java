package day39Recap.Task2;

public class Texas extends States{
    public Texas(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    @Override
    public void payTax() {
        super.payTax();
    }
}
