package day12Scanner_Methods;
/*
StockMarket task:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the nameOfDay of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"

 */
import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of shares");
        int num = scan.nextInt();

        System.out.println("How much is the value?");
        double value = scan.nextDouble();

        scan.nextLine();
        System.out.println("Enter the nameOfDay of company:");
        String name = scan.nextLine();

        double total = num * value;
        if (num > 0) {
            System.out.println("Your stock market holding is $" + total + " which is made up of " + num + " shares." + name + " is your company holding.");
        }
    }
}