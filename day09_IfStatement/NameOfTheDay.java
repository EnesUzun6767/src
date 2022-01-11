package day09_IfStatement;

public class NameOfTheDay {
    public static void main(String[] args) {
        // today is Monday
        int day=60;
        int exactDay=60%7;
        //String today;
        if(exactDay==0){
            System.out.println("Monday");// today="Monday"
        } else if(exactDay==1){
            System.out.println("Tuesday");
        }else if(exactDay==2){
            System.out.println("Wednesday");
        }else if(exactDay==3){
            System.out.println("Thursday");
        }else if (exactDay==4){
            System.out.println("Friday");
        }else if(exactDay==5){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }
    }
}
