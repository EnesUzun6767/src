package day27_WrapperClasses;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strongPass = scan.next();
        int sum = 0;
        String result1 = "";
        String result2 = "";
        String result3="";
        for (char each : strongPass.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }

        for (char each : strongPass.toCharArray()) {
            if (Character.isLowerCase(each)) {
                result1 += each;
            }
        }

        for (char each : strongPass.toCharArray()) {
            if (Character.isUpperCase(each)) {
                result2 += each;
            }
        }

        for (char each : strongPass.toCharArray()) {
            if (!(Character.isLetterOrDigit(each))) {
                result3 += each;
            }
        }
        String[]array=strongPass.split(" ");

        if(sum>0&&result1.length()>0&&result2.length()>0&&result3.length()>0&&array.length==1){
            System.out.println("Password is Strong");
        }else{
            System.out.println("Password is weak");
        }
    }

}




/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */