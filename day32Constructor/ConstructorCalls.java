package day32Constructor;

import com.sun.source.tree.NewArrayTree;

public class ConstructorCalls {
    public ConstructorCalls(){

        System.out.println("Default constructor");
    }
    public ConstructorCalls(int a){
        this();//Default constructor , Constructor with int argument
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls(String str){
       // this();  you have to call only one constructor
        this(10);//Default constructor , Constructor with int argument  Constructor with String argument

        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCalls obj1=new ConstructorCalls();


        System.out.println("--------------2nd call------------------");


        ConstructorCalls obj2=new ConstructorCalls(10);


        System.out.println("--------------3rd call------------------");
        ConstructorCalls obj3=new ConstructorCalls("Java");
    }
}
