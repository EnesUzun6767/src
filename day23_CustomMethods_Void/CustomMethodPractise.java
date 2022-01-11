package day23_CustomMethods_Void;

public class CustomMethodPractise {
    public static void main(String[] args) {
sayCydeo();
sayHello();
evenNumbers1to10();
    }
    public static void sayHello(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world!");

        }
    }
    public static void sayCydeo(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }
    public static void  evenNumbers1to10(){
        for (int i = 0; i < 11; i+=2) {
            System.out.print(i+" ");
        }
    }
}
