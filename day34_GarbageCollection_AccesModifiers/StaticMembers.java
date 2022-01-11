package day34_GarbageCollection_AccesModifiers;

public class StaticMembers {
    int a;
    static class class1{

    }//if inner  class is static
    public static int num=100;//variable
    public static void method(){

    }//method
    static {

    }//block can be static



}
class A{//outer class
    static class  B {//inner class
public static void method1(){
    System.out.println("hi");
}
    }
}

class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}