package day34_GarbageCollection_AccesModifiers;

public class Iphone {
    public String model;
    public String size;
    public String color;
    public static String brand;
    public static String madeIn;
    public static String designedIn;
    public static String OS;
    public int price;
    static boolean isSmart;

            static{
                brand="Iphone";
                madeIn="China";
                designedIn="USA";
                OS="IOS";
                isSmart=true;
            }

    public Iphone(String model, String size, String color, int price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }
    public static void printOperatingSystem(){
        System.out.println(OS);
    }
    public void call(long phoneNumber){
        System.out.println(brand+" "+model+"  is calling "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand+" "+model+" is texting "+phoneNumber);
    }
    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" is facetiming with "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand+" "+model+" is facetiming with "+email);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        printOperatingSystem();
        System.out.println(OS);
        System.out.println(Iphone.designedIn);
        System.out.println(Iphone.madeIn);
        Iphone iphone=new Iphone("i4","L","white",1200);
       iphone.text(123);
       iphone.faceTime("enes@gmail.com");
       iphone.call(1235);
      Iphone iphone2= new Iphone("I5","XL","blue",1300);
      iphone2.faceTime(1234564);
    }
}
/*
1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */