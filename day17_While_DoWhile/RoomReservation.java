package day17_While_DoWhile;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to Paradise hotel");
        System.out.println("Would you like to reserve a room?");
        String answer=scan.next();
        int total=0;

        while(!(answer.equals("yes")||answer.equals("no"))){
            System.out.println("please re-enter");
            System.out.println("Would you like to reserve a room?");
            answer=scan.next();
        }
        if(answer.equals("yes")){
            System.out.println("Options:\n1)King Bed:$120\n2)Queen Bed:$100\n3)Single Bed:$80");
            int option=scan.nextInt();
            switch (option){
                case 1:
                    total=120;
                    break;
                case 2:
                    total=100;
                    break;
                default:
                    total=80;
            }
            System.out.println("Your total is: $"+total);
        }else
            System.out.println("Have a nice day");
    }
}
