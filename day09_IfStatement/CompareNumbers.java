package day09_IfStatement;

public class CompareNumbers {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        if (a > b) {
            System.out.println(a + " is maximum number");
        }
        if(a==b){
            System.out.println(a+" and "+b+" are equals");
        }else {
            System.out.println(b + " is maximum number");
        }
        if (a < b) {
            System.out.println(a + " is minimum number");
        } if(a==b){
            System.out.println(a+" and "+b+" are equals");
        } else {
            System.out.println(a + " is minimum number");
        }
        int x=100;
        int y=200;
        int z=300;

        if((x>y&&x<z)||(x<y&&x>z)){ // n
            System.out.println(x+" is median");
        }else if((y>x&&y<z)||(y<x&&y>z)){
            System.out.println(y+" is median");
        }else{
            System.out.println(z+" is median");
        }
        int k = 18, l = 15, m = 17;// bu kod hata veriyor
        if(k > l && k < m){
            System.out.println(k +" is the median");
        }
        if(l > k && l < m){
            System.out.println(l + " is the median");
        }
        if(m > k && m < l){
            System.out.println(m + " is the median");
        }
    }
}
/*  1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number

2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */

