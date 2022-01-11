package day35Encapsulation.encapsulation;

public class Pizza {
    private char size;
    private int numberOfCheeseTopping,numberOfPepperoniTopping;

    public char getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
       setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public void setSize(char size) {
        if(!(size=='S'||size=='s'||size=='M'||size=='m'||size=='L'||size=='l')){
            return;
        }
        this.size = size;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if(numberOfCheeseTopping<0){
            return;
        }
        if((size=='S'||size=='s')&&(numberOfCheeseTopping>3)){
            return;
        }
        if((size=='M'||size=='m')&&(numberOfCheeseTopping>4)){
            return;
        }
        if((size=='L'||size=='l')&&(numberOfCheeseTopping>5)){
            return;
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if(numberOfPepperoniTopping<0){
            return;
        }
        if((size=='S'||size=='s')&&(numberOfPepperoniTopping>4)){
            return;
        }
        if((size=='M'||size=='m')&&(numberOfPepperoniTopping>5)){
            return;
        }
        if((size=='L'||size=='l')&&(numberOfPepperoniTopping>6)){
            return;
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }
}
/*
5. Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

 */