package day32Constructor;

public class Car {
    public String make;
    public String model;
    public int year;
    public double price;
    public String color;

    public Car(String make){
        this.make=make;
    }

    public Car(String make,String model){
        this(make);
        this.model=model;
    }
    public Car(String make,String model,int year){
        this(make, model);
        this.year=year;
    }
    public Car(String make,String model,int year,int price){
        this(make, model, year);
        this.price=price;
    }
    public Car(String make,String model,int year,int price,String color ){
        this(make, model, year, price);
        this.color=color;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
      Car car1=  new Car("audi","A4");
      Car car2=new Car("nissan","muro",2022);
        System.out.println(car1);
        System.out.println(car2);
        Car car3=new Car("audi");
        System.out.println(car3);
    }
}
