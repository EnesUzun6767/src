package A_Group_8_Java_Coding.Week2;

public class swapNumber {
    public static void main(String[] args) {
        int x=24;
        int y=10;
        x=x+y;   //x=34
        y=x-y;  //y=34-10=24
        x=x-y;  //x=34-24=10
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        swapNumbers(12,43);
    }
    public static void swapNumbers(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
