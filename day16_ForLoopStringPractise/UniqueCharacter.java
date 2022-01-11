package day16_ForLoopStringPractise;

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.next();
        String result="";
        for (int i = 0; i <=str.length()-1 ; i++) {
            char ch=str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                result+=ch;
            }
        }
        System.out.println(result+" is unique part");

    }
}
/* AAABCCD
indexOf('A')==>0
lastIndexOf('A")==>1


indexOf('B")==>3
lastIndexOf('B")==>3
 */




















