package day33Statics;

public class Address1 {
    public String street;
    public String city;
    public String state;
    public String zipCode;
    public static  String country="Canada";
    public static String planet="World";

    public Address1(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public void setInfo(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return  street+ "\n"+city+  "  "+  state  +"  " +zipCode;
    }
}
/*
5. Address Task:
		1. Create a class named Address:

		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet

	        Add a constructor that can set All the fields (instances)

		    Actions
		            setInfo: sets all the instances
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
 */