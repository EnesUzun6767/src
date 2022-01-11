package day05_Concatenation;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class ShippingAdress {
    public static void main(String[] args) {
        String name="Enes UZUN";
        int buildingNumber=255;
        String streetName="Ellesmeer Avenue";
        String city="Kingston";
        String state="ON";
        String zipCode="K7P3C6";

        String name2="Semra UZUN",
                buildingNumber2="255",
                streetName2="Ellesmeer Avenue",
                city2="Kingston",
                state2="ON",
                zipCode2="K7P3C6";
        String address=("\t"+name+"\n"+buildingNumber+" "+streetName+"\n"+city+", "+state+" "+zipCode);

        System.out.println("\t"+name+"\n"+buildingNumber+" "+streetName+"\n"+city+", "+state+" "+zipCode);
        System.out.println("    ");
        System.out.println(name2+"\n"+buildingNumber2+" "+streetName2+'\n'+city2+", "+state2+" "+zipCode2);

    }
}
/*
Create a class called ShippingAddress.java
Declare the following variables:
nameOfDay
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address
 */