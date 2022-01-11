package day17_While_DoWhile;

import java.util.Scanner;

public class PasswordUsername {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your user nameOfDay:");
        String username=scan.next();
        System.out.println("Enter your password:");
        String password=scan.next();
        int attempt=0;
        while(!(username.equals("Cydeo")&&password.equals("Cydeo123"))&&(attempt<2)){
            System.out.println("In correct username and password please re enter");
            System.out.println("Enter your user nameOfDay:");
            username=scan.next();
            System.out.println("Enter your password:");
            password=scan.next();
            attempt++;
            if(username.equals("Cydeo")&&(password.equals("Cydeo123"))){
                System.out.println("Logged-in");
                break;
            }
            System.out.println("System blocked");
        }

       }

    }

