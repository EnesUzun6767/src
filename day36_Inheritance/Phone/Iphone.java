package day36_Inheritance.Phone;

public class Iphone extends Phone{

    public void faceTime(long number){
        System.out.println(number+" on faceTime call");
    }
    public void faceTime(String email){
        System.out.println(email+" has faceTime");
    }

    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Iphone iphone1=new Iphone();
        iphone1.setInfo("Iphone","i5","white","XL",2000);
        System.out.println(iphone1);
        iphone1.faceTime(12312345);
        iphone1.faceTime("enesuzun");
    }
}
/*
1.2 Create a subclass of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()

 */