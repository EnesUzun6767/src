package day33Statics;

public class PhoneI {
    public String model;
    public double price;
    public String color;
    public char size;
    public static String brand="Apple";
    public static String OS = "IOS";
    public static String MadeIn = "China";


    public PhoneI(String model, double price, String color, char size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
        }
        public void  faceTime(long num){
            System.out.println(num+"has facetime");
        }
        public void  faceTime(String email){
            System.out.println(email+"is new created");
        }
        public void call(long number){
            System.out.println(number+"is calling");
        }
        public void text(long num2){
            System.out.println(num2+"is texting");
        }

    public String toString() {
        return "PhoneI{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

}

/*
4. IPhone Task:
		1. Creat a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */