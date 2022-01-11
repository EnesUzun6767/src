package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        /* (Condition) ?
        if   ?
        else    :
        else if  :(condition) ?
         */
    int a=101;
    int b=100;
    if(a%2==0){
        System.out.println(a+" is even number");
    }else{
        System.out.println(a+"is odd number");
    }
        String result=(b%2==0)? "even": "odd";
        System.out.println(b+" is "+result);

        int age=30;
        int age2=32;
        if (age>21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
        String result1=(age2>21)?"Eligible":"Not eligible";
        System.out.println(result1);

    int x=100;
    int y=-300;
     if(x>0){
        System.out.println(x+ "is positive");
    }else if(x<0){
         System.out.println(x+" is negative");
     }else{
         System.out.println(x+ "is zero");
     }
     String result2=(y>0) ? y+" is Positive":(y<0) ?y+" is Negative": y+" is zero";
        System.out.println(result2);

    }

}
