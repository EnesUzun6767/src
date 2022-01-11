package day14_String;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringMethods {
    public static void main(String[] args) {
        String s1="      batch 25        ";
        String s2=s1.trim();
        System.out.println(s2);

        String s3="Cydeo School";
        //         0123456789
        int s4=s3.indexOf('h');
        System.out.println(s4);

        int s5=s3.lastIndexOf('o');//last o
        int s6=s3.indexOf("ool");// takes first o in ool
        System.out.println(s5);
        System.out.println(s6);

        String a="Java Programming Language"; //23
       int a1= a.indexOf("a");// index of first a
        int a2=a.indexOf("a ");// index of second a
        int a3=a.indexOf("gu");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        //lastindex starting from right to the left

        int a4=a.lastIndexOf("g");
        System.out.println(a4);
        int a5=a.lastIndexOf("ge");// g for from the last to beginning part.
        System.out.println(a5);


    }
}
