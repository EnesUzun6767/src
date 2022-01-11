package day05_Concatenation;

import jdk.swing.interop.SwingInterOpUtils;

public class FullName {
    public static void main(String[] args) {
        String firstName="Enes";
        String lastName="UZUN";
        int age=38;
        String jobTitle="Senior SDET";
        String companyName="APPLE INC";
        String fullName=firstName+" "+lastName;
        int salary=100000;


        System.out.println("Full nameOfDay is "+firstName+ " "+lastName);
        System.out.println("full nameOfDay of the person is " + fullName);
        System.out.println(fullName+" is "+age+" years old.");
        System.out.println(fullName+" is "+jobTitle+" , and works at "+companyName+" ,"+fullName+"'s  salary is "+salary);
    }
}
