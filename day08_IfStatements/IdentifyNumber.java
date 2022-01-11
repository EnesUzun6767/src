public class IdentifyNumber {
    public static void main(String[] args) {
        /*
        1. Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false
         */

        int num=200;
        boolean isPositive=num>0;
        boolean isNegative=num<0;
        boolean isZero=num==0;
        System.out.println(num+" is positive :"+isPositive);
        System.out.println(num+" is negtive :"+isNegative);
        System.out.println(num+" is zero :"+isZero);
    }
}
