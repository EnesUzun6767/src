package day01_JavaIntro;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {

        int num = Integer.parseInt(s.substring(0, 2)); //07:05:45PM ==> "07" int 7

        while(s.equals("12:00:00AM")){
            s = "00" + s.substring(2, s.length() - 2);
        }
        while(s.equals("12:00:00PM")){
            s = s.substring(0, s.length() - 2);
        }
        while(s.contains("P")&&num<12) {
            num = num + 12;
            s = num + s.substring(2, s.length() - 2);
        }
        while(s.contains("A")&&num<12){
            s = s.substring(0, s.length() - 2);
        }
        System.out.println(s);
    }
}
