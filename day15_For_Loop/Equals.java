package day15_For_Loop;



import java.util.Locale;

public class Equals {
    public static void main(String[] args) {
        String s1="CYDEO";
        String s2="cydeo";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("====================================");

        String sentence="My favorite programming language is Java";
        boolean str2=sentence.toLowerCase(Locale.ROOT).contains("java");

        System.out.println(sentence.contains("Java"));//true
        System.out.println(sentence.contains("C#"));//false
        System.out.println(str2);
        System.out.println("=====================================");

        String input1="I love Java";
        String input2="Java";
        System.out.println(input1.equalsIgnoreCase("jAVA"));//false
        System.out.println(input1.toLowerCase(Locale.ROOT).contains("java"));//true
        System.out.println(input1.toUpperCase(Locale.ROOT).contains("JAVA"));//TRUE
        System.out.println("===================================================");

        String a="Wooden Spoon";
        boolean x=a.startsWith("Woo");//TRUE
        System.out.println(x);
        boolean y=a.endsWith("oon");//true
        System.out.println(y);

        boolean z=a.toUpperCase(Locale.ROOT).startsWith("WOO");
        System.out.println(z);//true
    }
}
