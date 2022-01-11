package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        System.out.println("Welcome to Paradise Hotel please check the options\n" +
                "1.King Bed:120$\n2.Quuen Bed:100$\n3.Single Bed:80$");
       int total=0;

        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Which bedroom would you like to reserve?");
            String answer = scan.next();
            while(!((answer.equals("1"))||(answer.equals("2"))||(answer.equals("3")))){
                System.out.println("Invalid entry please re enter");
                answer = scan.next();
            }
            System.out.println("How many days would you like to stay?");
            int day = scan.nextInt();
            if(answer.equals("1")){
                total+=120*day;
            }else if(answer.equals("2")){
                total+=100*day;
            }else{
                total+=80*day;
            }
            while(!(day>0)){
                System.out.println("Invalid entry please re-enter");
                 day = scan.nextInt();
            }

            System.out.println("Would you like to reserve another room?");
            String YesOrNo=scan.next();
            while(!((YesOrNo.equalsIgnoreCase("Yes"))
                    ||(YesOrNo.equalsIgnoreCase("no")))){
                System.out.println("Invalid entry please re-enter ");
                YesOrNo=scan.next();
            }
            if(YesOrNo.equalsIgnoreCase("no")){
                break;
            }

        }

        System.out.println("Your total is: "+total);

    }
}
