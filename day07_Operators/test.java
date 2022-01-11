package day07_Operators;
import java.util.Scanner;

public class test {
    public static void main(String[] args)  {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your Name: ");
                String name = sc.nextLine();
                System.out.println("Enter your age: ");
                int age = sc.nextInt();
                String citizen = sc.nextLine();
                if (age >= 18 && citizen.equals("USA")) {
                    System.out.println("Congratulations! " + name + " is eligible to vote!");

                }else {
                    System.out.println("Sorry, " + name + " is not eligible to vote.");

                }
            }
        }
