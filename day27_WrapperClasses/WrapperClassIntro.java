package day27_WrapperClasses;

import java.util.ArrayList;

public class WrapperClassIntro {
    public static void main(String[] args) {
        int num1=200;
       // Long n1=num1;
        Integer n1=num1;//autoboxing
        int num2=n1;//unboxing
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Integer integerValue=100;
        long longValue=integerValue;
        int num3=1;
       // Long a=num3;
Integer num4=num3;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Integer z=900;
        Integer y=z;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int[]number1={1,2,3,4,5};
        Integer[]numbers2={1,2,3,4,5};
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");



    }
}
