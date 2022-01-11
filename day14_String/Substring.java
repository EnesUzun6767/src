package day14_String;

public class Substring {
    public static void main(String[] args) {
        String word="Cydeo School";
                  // 01234
String brand=word.substring(0,4+1);//  does not include index 4  use 4+1
        System.out.println(brand);
        String s =word.substring(6);
        System.out.println(s);

        String word2="Java Programming Language";
        String s1=word2.substring(0,word2.indexOf(" "));//Java
        System.out.println("s1 = " + s1);
        
        String s2=word2.substring(word2.indexOf(" P"),word2.indexOf(" L"));
        System.out.println("s2= "+s2);
        
        String s3=word2.substring(word2.indexOf("L"));
        System.out.println("s3 = " + s3);

        
        




    }
}
