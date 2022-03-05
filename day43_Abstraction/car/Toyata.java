package day43_Abstraction.car;

public class Toyata extends Car{
    private int milage;
    public Toyata( String model, String color, int year, double price) {
        super( "Toyota",model, color, year, price);
    }

    @Override
    public void start() {

    }
}
