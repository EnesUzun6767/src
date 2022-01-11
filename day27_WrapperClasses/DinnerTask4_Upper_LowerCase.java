package day27_WrapperClasses;

import java.util.Scanner;

public class DinnerTask4_Upper_LowerCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        int count1=0,count2=0;
        char[]words=word.toCharArray();
        for (char each:words){
            if(Character.isUpperCase(each)){
                count1++;
            }else{
                count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        if( count1==count2){
            System.out.println("Equal size");
        }else{
            System.out.println("Different size");
        }
    }
}
