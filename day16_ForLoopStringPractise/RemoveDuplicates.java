package day16_ForLoopStringPractise;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your string");
        String str=scan.next();
        String nonDup="";
        for (int i = 0; i <=str.length()-1; i++) {
           String ch=""+str.charAt(i);
            if(!(nonDup.contains(ch))){//contains just for String so ""+ made as String
                nonDup+=ch;
            }
        }
        System.out.println(nonDup+" is the nonDup part");

    }
}
