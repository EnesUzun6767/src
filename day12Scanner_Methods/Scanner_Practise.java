package day12Scanner_Methods;

import java.util.Scanner;// java.util.*  wild import :imports everything from the package.

public class Scanner_Practise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number 1~7");
        int day = scan.nextInt();
        String result="";

        if (day >= 1 || day <= 7) {
            switch (day) {

                case 1:
                    result = "Monday";
                    break;
                case 2:
                    result = "Tuesday";
                    break;
                case 3:
                    result = "Wednesday";
                    break;
                case 4:
                    result = "Thursday";
                    break;
                case 5:
                    result = "Friday";
                    break;
                case 6:
                    result = "Saturday";
                    break;
                default:
                    result = "Sunday";
            }
            }else{
            System.out.println("Invalid value");
        }
        System.out.println(result);
//*********************************************************************
         result= (day >= 1 || day <= 7)? (day==1)?"Monday":(day==2)?"Tuesday":(day==3)?"Wednesday":
        (day==4)?"Thursday":(day==5)?"Friday":(day==6)?"Saturday":"Sunday":"Invalid Value";
        System.out.println("The day is: "+result);
    scan.close();
    }
}