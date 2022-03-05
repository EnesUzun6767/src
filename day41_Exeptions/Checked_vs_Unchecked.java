package day41_Exeptions;


import day39Recap.CydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        // System.out.println(a/b);// run time unchecked
        // System.out.println("");
        char[] character = {'A', 'B', 'C'};

        //  System.out.println(character[99]);

        //Student student=null;
        // System.out.println(student.getName());

        // String str="Wooden spoon";
        // str=null;
        //   System.out.println(str.toUpperCase());

        String str2 = "";//object!=null;
        System.out.println(str2.isEmpty());

        //checked Exception:
        System.out.println("Hello");
//Thread.sleep(3000);// 3seconds
        System.out.println("Cydeo");

        //FileInputStream file=new FileInputStream("path of the file");
        System.out.println("java".charAt(2000));
    }
}