package day06_PrimitiveTypeCasting;

public class Arithmetic_Operations {
    public static void main(String[] args) {

        /*
        +: Addition
        -:Subtraction
        *:Multiplication
        /:Division
        %:Remainder
         */
        System.out.println("12"+1);// concatenation
        System.out.println(50+10); //60
        System.out.println(40-1);//39
        System.out.println(5*11);//55
        System.out.println(10/4);//2  because of those are integer answer is integer
        System.out.println(10.0/4);// 2.5  any of those
        System.out.println(10/4.0);//2.5 works
        System.out.println((double) 10/2);


        int a=100;
        double b=a/6;
        System.out.println("b = " + b);
        double c=a/6.0;
        System.out.println("c = " + c);
        double d=(double)a/6;
        System.out.println("d = " + d);

        System.out.println("d makes it decimal "+ 100d);//100.0
    }
}
