package day13_String;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        String name="Wooden Spoon";// nameOfDay in stack memory "Wooden Spoon"String pool.
        String name1="Wooden Spoon";
        String name2="Wooden Spoon";//same
        String name3="Wooden Spoon";
        System.out.println(name==name1);//true
        System.out.println(name==name2);//true
        System.out.println(name==name3);//true

String name4="java";
String str3=new String("Java");
String str4=new String("Java");

        System.out.println(str3==str4);//false place  different
        System.out.println(str3.equals(str4));//true  same character
        System.out.println("_________------------------_________________--------------");
String s1="Java";
String s2=new String("Java");
        System.out.println(s1.equals(s2));//true  for values
        System.out.println(s1==s2);//false different memory part heap and string pool

    }
}
/* String presented in 'java lang' package .
Any class from this package can be imported implicitly.
Index number :starts from 0
"ENES"
 0123

 */
