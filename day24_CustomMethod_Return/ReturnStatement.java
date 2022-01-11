package day24_CustomMethod_Return;

public class ReturnStatement {
    public static void main(String[] args) {
nameOfDay(5);

        // nameOfDay of day
    }
    public static void nameOfDay(int numberOfDay){
        if(numberOfDay<1||numberOfDay>7){
            System.out.println("Invalid");
            return;//just exiting
        }
        if(numberOfDay==1){
            System.out.println("Monday");
        }else if(numberOfDay==2){
            System.out.println("Tuesday");
        }else if(numberOfDay==3){
            System.out.println("Wednesday");
        }else if(numberOfDay==4){
            System.out.println("Thursday");
        }else if(numberOfDay==5){
            System.out.println("Friday");
        }else if(numberOfDay==6){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }


    }
}
