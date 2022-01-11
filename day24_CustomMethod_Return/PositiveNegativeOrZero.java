package day24_CustomMethod_Return;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        int number=45;
        String result=positiveNegativeZero(number);
        System.out.println(number +" is "+result);

    }
    public static String positiveNegativeZero(int number){
        String result="";
        if(number>0){
            result="positive";
        }else if(number<0){
            result="negative";
        }else{
            result="zero";

        }
        return result;
    }
}
