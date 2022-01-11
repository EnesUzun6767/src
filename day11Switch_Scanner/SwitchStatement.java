package day11Switch_Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        int num = 5;


        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
/*
Case value MUST match  with switch data type and unique.
It has to be number or character
long is not used 9l
float cannot  9f
double can not 9D
boolean can not
break used  for exiting the w=switch.
if we do not give the break statement,switch statement continue to execute the next
blocks until the break statement or } of the switch.
default block gets executed if none  of the case block matched.
 */