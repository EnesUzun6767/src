package day12Scanner_Methods;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your full nameOfDay:");
        String fullName= scan.nextLine();

        System.out.println("Enter your building number:");
        String buildingNo= scan.next();

        scan.nextLine();

        System.out.println("Enter your Street nameOfDay:");
        String streetName=scan.nextLine();

        System.out.println("Enter your city nameOfDay:");
        String cityName= scan.nextLine();

        System.out.println("Enter your State:");
        String state= scan.next();

        System.out.println("Enter your zip code:");
        String zipcode= scan.next();

        scan.nextLine();

        System.out.println("Enter the country nameOfDay");
        String countryName= scan.nextLine();

        System.out.println( "\t"+fullName);
        System.out.println( buildingNo+ " "+streetName);
        System.out.println(cityName+" "+state);
        System.out.println( zipcode+" "+countryName);
    scan.close();
    }
}
