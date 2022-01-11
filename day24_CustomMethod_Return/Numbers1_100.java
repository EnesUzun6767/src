package day24_CustomMethod_Return;

public class Numbers1_100 {
    public static void main(String[] args) {
int num=97;
     String num1=oddEvenNumbers(num);
        System.out.println(num1);
    }
    public static String oddEvenNumbers(int numbers){
       String result="";
        if(numbers%2==1){
            result=numbers+" is odd number";
        }else{
           result=numbers+" is even number";
        }
        return result;
    }

}
