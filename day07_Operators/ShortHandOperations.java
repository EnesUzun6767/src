package day07_Operators;

public class ShortHandOperations {
    public static void main(String[] args) {
        int num=100;

        System.out.println("num = " + num);//100
        num=24;
        System.out.println("num = " + num);//24

        String word="Java programming";
        System.out.println("word = " + word);// Java Programming
        word="Cydeo";
        System.out.println("word = " + word);// Cydeo
        word="123"+1;
        System.out.println("word = " + word);//1231

// Addition Asssignment  x+=y means x=x+y
        int x=100;
        System.out.println("x = " + x);//100
        System.out.println( x+200);// 300
        x+=200; //x=x+200;
        System.out.println("x = " + x);
        
        String str="Wooden";
        str+=" Spoon";
        System.out.println("str = " + str);

        double num1=2.5;
        num1+=5.5;
        System.out.println("num1 = " + num1);
        
        double avaliableBalance=100.50;
        avaliableBalance+=300;
        System.out.println("avaliableBalance = " + avaliableBalance);

        //Subtraction
        //x-=y; x=x-y
        avaliableBalance-=50;
        System.out.println("avaliableBalance = " + avaliableBalance);
         // withdrawing 200$,then depositing 400$
        avaliableBalance-=200;
        avaliableBalance+=400;
        System.out.println("avaliableBalance = " + avaliableBalance);
        
        double salary=50000.50;
        System.out.println("salary = " + salary);
        salary*=2;
        System.out.println("salary = " + salary);
        
        double doge=0.000000001;
        doge*=1000000;
        System.out.println("doge = " + doge);

        double num2=25000;
        num2/=2;
        System.out.println("num2 = " + num2);

        double num3=100;
        num3%=3;
        System.out.println("num3 = " + num3);

        int amount=127;
        int quarters=amount/=25;
        System.out.println("quarters = " + quarters);
        
        int cents=127;
        cents%=25;
        System.out.println("cents = " + cents);
        


        

    }
}
