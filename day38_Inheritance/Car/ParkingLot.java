package day38_Inheritance.Car;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota=new Toyota("Camry",2020,20000,"Gray",123345);
    toyota.start();
    Tesla tesla=new Tesla("s1",2022,12000,"white",213);
    tesla.start();
    BMW bmw=new BMW("a3",2020,12000,"blue",32111);
    bmw.start();
    toyota.drive();
    }
}
