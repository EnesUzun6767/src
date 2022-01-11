package day13_String;
import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your gender");
        String gender = scan.next();
        scan.nextLine();
        System.out.println("Enter your full nameOfDay");
        String fullName = scan.nextLine();
        System.out.println("Enter your phone number");
        long phoneNumber = scan.nextLong();
        scan.nextLine();
        System.out.println("Enter your zipcode");
        String zipCode = scan.nextLine();
        System.out.println("Enter your school nameOfDay");
        String schoolName = scan.nextLine();
        System.out.println("Enter your city nameOfDay");
        String city = scan.nextLine();
        System.out.println("Enter your state nameOfDay");
        String state = scan.next();
        System.out.println("Enter your building number");
        int building = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your street nameOfDay");
        String street = scan.nextLine();

        System.out.println(fullName + "\n" + age + "\n" + gender + "\n" + phoneNumber + "\nAddress:\t" + building +
                " " + street + "\n\t" + city + ", " + state + " " + zipCode + "\n\n" + schoolName );

scan.close();
    }
}

/*
 Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            scan.nextLine();
            3. Enter your full nameOfDay (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            scan.nextLine();
            6. Enter your School nameOfDay (String- Can be Multiple words)
            7. Enter your city nameOfDay (String- Can be Multiple words)
            8. Enter your state nameOfDay (String- One word ONLY)
            9. Enter your building number (int)
            scan.nextLine();
            10. Enter your Street nameOfDay(String- Can be Multiple words)

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in separate lines:

            1. full nameOfDay
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school nameOfDay
 */

