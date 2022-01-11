package day11Switch_Scanner;
/*
Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */
public class CappucinoBuyer {
    public static void main(String[] args) {
        String size1 = "tall", size2 = "grande", size3 = "venti", order = "grande";
        boolean valid = (order == size1 || order == size2 || order == size3);
        if (valid) {
            if (order == "tall") {
                System.out.println(size1 + ":\n\t\tprice is 3.69\n\t\t90 calories");
            } else if (order == "grande") {
                System.out.println(size2 + ":\n\t\tprice is 3.99\n\t\t120 calories");
            } else {
                System.out.println(size3 + ":\n\t\tprice is 4.29\n\t\t150 calories");
            }
        } else {
            System.out.println("Invalid order");
        }


        switch (order) {
            case "tall":
                System.out.println(size1 + ":\n\t\tprice is 3.69\n\t\t90 calories");
                break;
            case "grande":
                System.out.println(size2 + ":\n\t\tprice is 3.99\n\t\t120 calories");
                break;
            case "venti":
                System.out.println(size3 + ":\n\t\tprice is 4.29\n\t\t150 calories");
       break;
            default:
                System.out.println("Invalid order");
        }

        if(valid){
            switch (order) {
                case "tall":
                    System.out.println(size1 + ":\n\t\tprice is 3.69\n\t\t90 calories");
                    break;
                case "grande":
                    System.out.println(size2 + ":\n\t\tprice is 3.99\n\t\t120 calories");
                    break;
                case "venti":
                    System.out.println(size3 + ":\n\t\tprice is 4.29\n\t\t150 calories");
                    break;

        }
    }else{
            System.out.println("Invalid order");
        }
}
}