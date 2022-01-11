package day07_Operators;

public class RelationalOperator {
    public static void main(String[] args) {
     // >,<,>=,<=
        boolean result1=200>40;
        System.out.println("result1 = " + result1);

        boolean result2=300>=150;
        System.out.println("result2 = " + result2);

        boolean result3=100>=100;
        System.out.println("result3 = " + result3);

        System.out.println("---------_________----------_________-----__");
        int score=59;
        boolean hasFailed=score<60;
        boolean hasFailed2=score<=59;
        System.out.println("hasFailed2 = " + hasFailed2);
        System.out.println("hasFailed = " + hasFailed);

        boolean result5="Enes"=="Math";// false
        System.out.println("result5 = " + result5);

        boolean result6='A'=='a';//false
        System.out.println("result6 = " + result6);

        boolean result7="Java"=="Java";
        System.out.println("result7 = " + result7);

        System.out.println("________---------__________");

        boolean result8="Enes"!="Math";// false
        System.out.println("result8 = " + result8);
        boolean result9=200!=200.0;
        System.out.println("result9 = " + result9);



    }
}
