package day34_GarbageCollection_AccesModifiers;

public class AccessModifiersTest {
    public static void main(String[] args) {
        System.out.println(AccessModifier.publicData);
        System.out.println(AccessModifier.defaultData);
       // System.out.println(AccessModifier.privateData); private is not accessible in different class.
    AccessModifier.method1();
    AccessModifier.method2();
    //AccessModifier.method3();  is private only visible in its class.


    }
}
