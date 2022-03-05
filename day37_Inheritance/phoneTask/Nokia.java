package day37_Inheritance.phoneTask;

public final class Nokia extends Phone {
    public Nokia( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void faceTime(long phoneNumber) {
        System.out.println(brand + " " + model + " is having a Face Time with phone number :" + phoneNumber);
    }
    public  void selfDefence(long phoneNumber){
        System.out.println(brand + " " + model + " is having a selfDefence with phone number :" + phoneNumber);
    }

}