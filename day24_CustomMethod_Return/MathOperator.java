package day24_CustomMethod_Return;

public class MathOperator {
    public static void main(String[] args) {
        int num1=50;
        int num2=2;
        double result=mathCalculator(num1,num2,"/");
        System.out.println(result);
        double result2=mathCalculator(num1,num2,"+");
        System.out.println(result2);
        double result3=mathCalculator(num1,num2,"-");
        System.out.println(result3);
        double result4=mathCalculator(num1,num2,"*");
        System.out.println(result4);

    }
    public static double mathCalculator(int num1,int num2,String operator){
        double result=0;
        if(operator.equals("+")){
            result=num1+num2;
        }else if(operator.equals("-")){
            result=num1-num2;
        }else if(operator.equals("/")){
            result=num1/num2;
        }else{
            result=num1*num2;
        }
        return result;
    }
}
