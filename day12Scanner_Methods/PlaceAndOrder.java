package day12Scanner_Methods;
/*
PlaceAnOrder task:
                Ask User to enter the product nameOfDay (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first nameOfDay (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */
import java.util.Scanner;

public class PlaceAndOrder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Write the nameOfDay of product:");
        String name= scan.nextLine();

        System.out.println("Price:");
        double price= scan.nextDouble();

        System.out.println("Quantity:");
        int quan= scan.nextInt();

        System.out.println("nameOfDay");
        String nameProduct= scan.next();

        double total=price*quan;

        System.out.println(" your order for "+quan+" "+nameProduct+" "+name+" has been places. Your total is $"+total);

    }
}
