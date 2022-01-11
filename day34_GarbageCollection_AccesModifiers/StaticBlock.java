package day34_GarbageCollection_AccesModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main METHOD");
    }
    static {//runs first before anything,and only runs one time
        System.out.println("Static Block");

    }
}
