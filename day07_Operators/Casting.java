package day07_Operators;

public class Casting {
    public static void main(String[] args) {
        float avarageScore=20.5f;
        byte num1= (byte) avarageScore;
        short num2= (short) avarageScore;
        int num3= (int) avarageScore;
        long num4= (long) avarageScore;
        float num5=avarageScore;
        double num6=avarageScore;
        System.out.println("num6 = " + num6);
        System.out.println("num5 = " + num5);
        System.out.println("num4 = " + num4);
        System.out.println("num3 = " + num3);
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);

        float myNumber=12.4f;
        byte num_1=(byte)myNumber;
        short num_2=(short)myNumber;
        int num_3=(int)myNumber;
        long num_4=(long)myNumber;
        float num_5=myNumber;
        double num_6=myNumber;

        System.out.println("num_6 = " + num_6);
        System.out.println("num_5 = " + num_5);
        System.out.println("num_4 = " + num_4);
        System.out.println("num_3 = " + num_3);
        System.out.println("num_2 = " + num_2);
        System.out.println("num_1 = " + num_1);
    }
}
