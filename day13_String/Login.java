package day13_String;
import java.util.Scanner;
/*
You are writing a code for the log-in function of the Cybertek Application,
assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched,
        your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

 */
public class Login {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String userName="Cydeo";
        String password="Woodenspoon";
        System.out.println("Enter your username:");
        String userName1=scan.next();
        System.out.println("Enter your password:");
        String password1=scan.next();

        if(userName.equals(userName1)&&(password.equals(password1))){
            System.out.println("Logged In");
        }else{
            System.out.println("Incorrect username or password");
        }
    }
}
