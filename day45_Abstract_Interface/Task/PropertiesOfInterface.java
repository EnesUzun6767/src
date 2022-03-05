package day45_Abstract_Interface.Task;

public interface PropertiesOfInterface {
    int a=100;//final and static by default
   final static int b=200;// final by default

  /*  public PropertiesOfInterface(int a) {  can not create object no need for constractor
        this.a = a;
    }

   */

    /*static {
        b=100;// assigned at the begining
    }

     */

   /* public  void method1(){
        System.out.println("instance method");// not called without object
    }

    */
    public static void method2(){
        System.out.println("static method");
    }


    public abstract void method3();

    public default void method(){
        System.out.println("default method");
    }
}
