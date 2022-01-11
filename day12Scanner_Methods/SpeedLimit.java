package day12Scanner_Methods;

import java.util.Scanner;
/* Write a program for the speed check. a variable named speedLimit is given and assigned,
 ask user to enter the current speed, if the current speed is over the speedLimit print slow down,
  otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!

 */
public class SpeedLimit {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter current speed limit:");
        int speed= scan.nextInt();

        if(speed>50){
            System.out.println("You are driving "+speed+" mph over the limit.Slow down!");
        }

    }
}
