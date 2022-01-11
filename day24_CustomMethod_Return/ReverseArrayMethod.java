package day24_CustomMethod_Return;

public class ReverseArrayMethod {
    public static void main(String[] args) {
        String[] array={"Java","is","the","best"};
        String reverse=reversed(array);
        System.out.println(reverse);
    }
    public static String reversed(String[] str){
       String result="";
        for (String each : str) {
            result=each+" "+result;
        }
        return result;
    }
}
//4.create a method that return the reversed array