package day38_Inheritance.Car;

public class BMW  extends Car{


    public BMW(String brand, String model, int year, double price, String color, int miles) {
        super(brand, model, year, price, color, miles);
    }

    public void breaksDown(){
            System.out.println(brand + " "+ model +" is breaking down");
        }

        public void racing(){
            System.out.println(brand + " "+ model +" is a racing car");
        }

    }

/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
*/

