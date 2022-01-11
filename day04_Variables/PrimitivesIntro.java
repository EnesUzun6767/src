package day04_Variables;

import jdk.swing.interop.SwingInterOpUtils;

public class PrimitivesIntro {
    public static void main(String[] args) {
//byte  short int long ===> for integers  float double===>  for decimals.
        byte age=12;
        System.out.println();

        short weight=160;
        int salary=100000;
        long distance=3_333_333_333L;// use l or L  at the end of.
        float tax=0.26f;//  F veya f ekle.
        double pi=3.14; // no d . preffered for decimals
        char ch1='#';
        char ch2=35;
        char ch3=45000;
        char ch5='A';
        boolean isEmployed= true;
        String name="Enes";
        String city="KINGSTON";
        String country="CANADA";


        System.out.println("country = " + country);
        System.out.println("isEmployed = " + isEmployed);
        System.out.println();
        System.out.println("ch3 = " + ch3);;
        System.out.println("ch2 = " + ch2);
        System.out.println("ch1 = " + ch1);
        System.out.println(distance);



    }
}
