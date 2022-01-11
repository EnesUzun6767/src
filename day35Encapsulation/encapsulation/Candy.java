package day35Encapsulation.encapsulation;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(int quantity) {
        if(quantity<0){

        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if(price<0){

            return;
        }
        if(price==0){
            System.out.println("free");
        }
        this.price = price;
    }
    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }
    public String isFree(){
        String free="";
        if(price==0)free+="Free";
        else free+=price;
        return free;
    }
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + isFree() +
                ", hasPeanuts=" + hasPeanuts +
                '}';


    }

    public static void main(String[] args) {
        Candy candy1=new Candy("new",3,0,true);
        System.out.println(candy1);
    }
}
/*
1. CandiesTask
         1.1 Create a custom class named Candy
                private variables:
                    brand (String), quantity (int), price (double), hasPeanuts (boolean)

                Encapsulate All the private fields
                        (price of candy can not be set to negative)
                        (quantity of candy can not be set to zero or negative)

                Add a constructor that allows user to set all the fields when the object is
                created.
                        (If the arguments not valid it should not be set to the instances)

                Extra methods:
                    toString():
                        if the price is zero, print "free" instead of 0
 */