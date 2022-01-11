package day00_Test;

import java.util.Scanner;

public class Fibonnacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=1;
        for (int i = 0; i < 9; i++) {//5
            System.out.print(a+" ");//0 1 1 2 3
            a=b;//1 1 2 3
            b=c;//1 2 3 5
            c=a+b;//2 3 5 8

        }
        System.out.println();
        System.out.println("---------------second method----------------");
        int x=0;
        int y=1;
        int z=0;

        for (int i = 0; i < 9; i++) {//5
            System.out.print(z+" ");//0 1 1 2 3
            x=y;//1 0  1 1
            y=z;//0  1 1 2
            z=x+y;//1 1 2 3

        }
        System.out.println();
        System.out.println("--------------------third method------------------");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num) {

        int [] nums = new int[num+1];
        nums[0]=0;
        nums[1]=1;
        System.out.print(nums[0]+" "+nums[1]+" ");
        for(int i=2; i<=num; i++){


            nums[i]=nums[i-2]+nums[i-1];
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println(nums[num]);


    }
}
