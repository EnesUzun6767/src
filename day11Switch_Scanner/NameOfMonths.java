package day11Switch_Scanner;

import java.sql.SQLOutput;

public class NameOfMonths {
    public static void main(String[] args) {
        int month=7;
        String result="";
        switch (month){
            case 1:
                result="Jan";
                break;
            case 2:
                result="Feb";
                break;
            case 3:
                result="Mar";
                break;
            case 4:
                result="Apr";
                break;
                case 5:
                result="May";
                break;
            case 6:
                result="June";
                break;
            case 7:
                result="July";
                break;
            case 8:
                result="Aug";
                break;
            case 9:
                result="Sept";
                break;
            case 10:
                result="Oct";
                break;
            case 11:
                result="Nov";
                break;
            case 12:
                result="Dec";
                break;
            default:
                System.out.println("Invalid value");

        }
        System.out.println(result);

    }
}
