package day39Recap.Task2;

public class Virginia extends States {
    public Virginia(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    @Override
    public void payTax() {
        super.payTax();
    }
}
