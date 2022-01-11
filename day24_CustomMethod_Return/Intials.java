package day24_CustomMethod_Return;

import java.util.Locale;

public class Intials {
    public static void main(String[] args) {
intials("enes","uzun");
        System.out.println("++++++++++++++++++++++++++++++++++++++=");
domain("enesuzun@gmail.com");
        System.out.println("++++++++++++++++++++++++++++++");
        String[]emails={"enes@gamil.com","ns@yahoo.com","semra@math.com"};
        for (String email : emails) {
            domain(email);
        }
        System.out.println("-----------------------------");
        nameOfMonth(11);
        }
    public static void intials(String firstName,String lastName){
        System.out.println(firstName.toUpperCase(Locale.ROOT).charAt(0)+"-"+lastName.toUpperCase(Locale.ROOT).charAt(0));
    }
    public static void domain(String email){
        System.out.println(email.substring(email.indexOf('@')+1,email.lastIndexOf('.')));


    }
    //3. Create a method that can display the nameOfDay of the month based on the given number to the method
    public static void nameOfMonth(int number){  // 95
        String name = "";
        if(number >= 1 && number <= 12){
            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";
        }else{
            name = "Invalid";
        }
        System.out.println("Month nameOfDay = " + name);
    }
    //4. Create a method that can print the nameOfDay of the day based on the given number to the method
    public static void nameOfDay(int number){
    }
    //5. Create a method that can print how many days a month has
    public static void daysInMonth(int number){
    }
    // ageGroups(int age)

}
/*1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the nameOfDay of the month based on the given number to the method

4. Create a method that can print the nameOfDay of the day based on the given number to the method

5. Create a method that can print how many days a month has*/