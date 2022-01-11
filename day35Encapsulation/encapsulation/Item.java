package day35Encapsulation.encapsulation;

public class Item {
    private String name;
    private double price;
    private int identity;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getIdentity() {
        return identity;
    }

    public Item(String name, double price, int identity) {
        setName(name);
        setPrice(price);
        setIdentity(identity);
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            return;
        }for (int i = 0; i < name.length(); i++) {
                if ((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')) {
                    this.name = name;
                } else {
                    return;
                }
                this.name = name;
            }
        }

    public void setPrice(double price) {
        if(price<0){
            return;
        }
        this.price = price;
    }

    public void setIdentity(int identity) {
        if(identity<0){
            return;
        }
        this.identity = identity;
    }
    public double totalPrice(){
        double total=identity*price;
        return total;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=$ " + price +
                ", identity=" + identity +
                ", totalPrice$ =" + identity +
                '}';
    }
}
/*
4. Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case-insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */