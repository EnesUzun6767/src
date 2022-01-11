package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter you age");
        int age=scan.nextInt();//valid age 1-120

        while(!(age>=1&&age<=120)){
            System.err.println("Invalid enter please re-enter");
            age=scan.nextInt();
        }
        System.out.println("Are you a US citizen?  yes/no");
        String answer=scan.next().toLowerCase(Locale.ROOT);
        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid answer please re-enter");
            answer=scan.next().toLowerCase(Locale.ROOT);
        }
        if(age>=18&&answer.equals("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible");
        }
    }
}
