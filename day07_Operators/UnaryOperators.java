package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1=25;
        ++num1;
        System.out.println("num1 = " + num1);
        int num2=--num1;
        System.out.println("num2 = " + num2);

        int a=100;
        System.out.println("a is:"+a++);;;//post increment not affect
        System.out.println("a is now: "+a);
         int x=200;
        System.out.println(--x);// 199 now pre decrement

        int y=300;
        System.out.println("y is now:"+y--);// 299 for the next step
        System.out.println("y after :"+y);

        int w=10;
        System.out.println("w;"+ w--);//10 now 9 next
        System.out.println("w"+ w++);//9 now turns to 10
        System.out.println("w:"+ w);

        int q=30;
        System.out.println(--q);//29
        System.out.println(q--);//29  next turn to 28
        System.out.println(q);//28


        

    /*  int a=10
    sout(++a)==> 26
    sout(--a)==> 25   pre incremenet and decremenet
     */
        /*
        intb=100;
        sout(b++)==> still 100

         */
    }
}
