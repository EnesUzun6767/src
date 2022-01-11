package day14_String;

import jdk.swing.interop.SwingInterOpUtils;

public class Replace {
    public static void main(String[] args) {
        String s1="Java is fun, I like Java programming";
        String s2=s1.replaceFirst("Java","C#");
        System.out.println(s2);
        String s3=s1.replace("Java","C++");
        System.out.println(s3);

        String s4="Java Java Java";
        String s5=s4.replace(" Java ","Phyton");
        System.out.println(s5);
    }
}
