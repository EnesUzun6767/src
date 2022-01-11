package day10_NestedIf;

public class NameOfDate_Ternary {
    public static void main(String[] args) {
        int n=6;
        String result=(n==1)? "Monday":(n==2)? "Tuesday":(n==3)?"Wednesday"
                :(n==4)?"Thursday":(n==5)?"Friday":(n==6)?"Saturday":"Sunday";
        System.out.println("The day is "+result);
    }
}
