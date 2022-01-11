package day12Scanner_Methods;

import java.util.Scanner;

/* Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

 */
public class DollarToCent {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter cent");
        int cent=scan.nextInt();

        int dollar=cent/100, centPart=cent%100;

        System.out.println(cent+"cent equals to:"+dollar+" dollars "+centPart+" cents");
    scan.close();
    }
}
