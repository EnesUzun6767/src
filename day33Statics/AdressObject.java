package day33Statics;

public class AdressObject {
    public static void main(String[] args) {
        Address1 address1=new Address1("255 ELLESMEER AVENUE","KINGSTON","ON","K7P3C6");
        System.out.println(address1);
        System.out.println( Address1.country);
        System.out.println(Address1.planet);
    }
}
