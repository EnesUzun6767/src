package day11Switch_Scanner;

import javax.print.DocFlavor;

public class Grade {
    public static void main(String[] args) {
        /*
        1. NameOfMonth  (1~12)
	2. NumberToWord (0~9)
	3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			otherwise: invalid
         */
    char ch='B';
    String result="";
    switch (ch){
        case 'A':
            result="Excellent";
            break;
        case 'B':
            result="Great job";
            break;
        case 'C':
            result="Good";
            break;
        case 'D':
            result="Passed";
            break;
        case 'F':
            result="Failed";
            break;
        default:
            System.out.println("Invalid");
    }
        System.out.println(result);

    }/*case 'A': case 'B': case 'C': case'D':
    result="Passed"
    break;
    case 'F':
    result="Failed"
    break;
    default:
    .
    .
    .
    */
}
