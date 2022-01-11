package day34_GarbageCollection_AccesModifiers;
import static day34_GarbageCollection_AccesModifiers.Circle.*;
import static Utility.MathUtilitiy.*;
public class Test {

    public static void main(String[] args) {
        System.out.println(pi);//import static
        System.out.println(name);//import static
        System.out.println(numbers);//import static

        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println("----------------------------------------------------------");
        System.out.println(sum(10,20));
        System.out.println(subtract(200,120));
        System.out.println(multiplication(12,32));
        int num1=multiplication(12,11);
        System.out.println(num1);
    }

}
