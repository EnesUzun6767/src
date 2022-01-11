package day23_CustomMethods_Void;

public class CustomMethodParameter {
    public static void main(String[] args) {
        oddOrEven(5);
        ageOfPerson(1984);
        numbersBetween(10,17);
    }
    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }
    }
    public static void ageOfPerson(int birthYear){
        int age=2021-birthYear;
        System.out.println("Your age is"+age);
    }
    public static void numbersBetween(int number1,int number2){

        for (int i = number1; i <number2 ; i++) {
            System.out.print(i+ ", ");

        }

    }
}


