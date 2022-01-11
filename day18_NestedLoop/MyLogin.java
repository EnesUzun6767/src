package day18_NestedLoop;

import java.util.Scanner;

public class MyLogin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your username:");
        String us= scan.next();;
        System.out.println("Enter your password:");
        String pass= scan.next();
        System.out.println("Logged in");
        int attemp=1;
        while(!(us.equals("Cydeo")&&(pass.equals("WoodenSpoon")))&&attemp<3){
            System.out.println("inValid info please re-enter");
            System.out.println("Enter your username:");
            us= scan.next();;
            System.out.println("Enter your password:");
             pass= scan.next();
             attemp++;
             if(us.equals("Cydeo")&&(pass.equals("WoodenSpoon"))){
                System.out.println("Logged In");
            break;
        }
            System.out.println("System locked");
        }


    }
}
