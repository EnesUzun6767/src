package day11Switch_Scanner;

public class Number2Word {
    public static void main(String[] args) {
        int number=5;
        String result="";
        switch (number){
            case 1:
                result="one";
                break;
            case 2:
                result="two";
                break;
            case 3:
                result="three";
                break;
            case 4:
                result="four";
                break;
            case 5:
                result="five";
                break;
            case 6:
                result="six";
                break;
            case 7:
                result="seven";
                break;
            case 8:
                result="eight";
                break;
            case 9:
                result="nine";
                break;
            default:
                System.out.println("Invalid number");
        }
        System.out.println(result);
    }
}
