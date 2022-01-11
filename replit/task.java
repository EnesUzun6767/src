package replit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        int num=8;
        int num1=0;
        int num2=1;
        int result=num1+num2;
        System.out.print(num1+", "+num2+" ");
        for (int i = 0; i <num-1; i++) {
            result=num1+num2;
            System.out.print(", "+result);
            num1=num2;
            num2=result;
    }

    }
    }

