package day12Scanner_Methods;

import java.util.Scanner;

public class Grade_Report {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your score:");
        int score=scan.nextInt();
        String result="";
         result=(score>=0&&score<=100)?(score>=90)? "A":(score>=80)? "B":(score>=70)?
                 "C":(score>=60)?"D":"F":"Invalid value";
        System.out.println(result);
        scan.close();
    }
}
