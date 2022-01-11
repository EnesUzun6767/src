package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
int length= scan.nextInt();
String result="";
int[]num1=new int[length];
int[]num2=new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
            num1[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(num1));
        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
            num2[i]= scan.nextInt();
        }

        System.out.println(Arrays.toString(num2));
        for (int i = 0; i < num1.length; i++) {
            int count=0;
            for (int j = 0; j < num2.length; j++) {
                if (num1[i]==num2[j]){
                    count++;
                }
                }
            if (count>=1){
                    result+=num1[i];
            }

        }

        System.out.println(result);
        String nonDup="";
        for (int i = 0; i < result.length(); i++) {
           String ch= ""+result.charAt(i);
           if(!(nonDup.contains(ch))){
               nonDup+=""+ch;
           }
        }
        System.out.println(nonDup);

        int[]common=new int[nonDup.length()];
        for (int i = 0; i < nonDup.length(); i++) {
            common[i]=nonDup.charAt(i)-'0';

        }
        System.out.println(Arrays.toString(common));


    }
}
