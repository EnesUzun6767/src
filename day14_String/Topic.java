package day14_String;

public class Topic {
    public static void main(String[] args) {
     /* 1. String literal:all teh string literals will be stored in string pool.
      String s1="Enes";
      String s2="Enes";
    2.by new keyword: new different object will be created in the heap.
       String s3=new String("Enes");
        String s4=new String("Enes");

      */
        String s1="Enes";
        String s2="Enes";

        String s3=new String("Enes");
        String s4=new String("Enes");

        System.out.println(s1==s2);//true String pool

        System.out.println(s3==s4);// false  created 2 in the heap

        System.err.println(s1==s3); //false
/* 2.Sequences of characters
each character in string has representative number called index number(starts from 0)
ENES
0123
3.Immutable,once the object is created it can be modified.
String str="Enes"
str=str.toUpperCase();"ENES"   now changed to ENES

 */

    }
}
