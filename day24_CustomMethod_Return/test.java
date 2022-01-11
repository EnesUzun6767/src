package day24_CustomMethod_Return;

public class test {
    public static void main(String[] args) {
        int number=9;
        String day=nameOfDay(number);
        System.out.println(day);

    }


    // nameOfDay of day

    public static String nameOfDay(int numberOfDay){
        String result="";
        if(numberOfDay<1||numberOfDay>7){

            return "Invalid";

        }
        if(numberOfDay==1){
            result="Monday";
        }else if(numberOfDay==2){
            result="Tuesday";
        }else if(numberOfDay==3){
            result="Wednesday";
        }else if(numberOfDay==4){
            result="Thursday";
        }else if(numberOfDay==5){
            result="Friday";
        }else if(numberOfDay==6){
           result="Saturday";
        }else{
            result="Sunday";
        }

return result;
    }
}