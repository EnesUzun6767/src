package day34_GarbageCollection_AccesModifiers;

public class AccessModifier {
    public static int publicData=100;//everyplace
    static int defaultData=200;//access modifier:default;
    private static int privateData=300;
protected  static int defaultvalue=500;

    public static void method1(){
        System.out.println("Public");
    }
    static void method2(){
        System.out.println("Default");
    }
    private static void method3(){
        System.out.println("Private");
    }

    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);

    }

}
