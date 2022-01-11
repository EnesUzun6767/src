package day10_NestedIf;

public class PassedOrFailed {
    public static void main(String[] args) {
        int score=96;
        String result=(score>=0&&score<=100)? (score>=60)?"Passed":"Failed":"invalid";
        System.out.println(result);
        String result2=(score>=0&&score<=100)?(score>=90)? "Excellent":(score>=80)?"Great":
                (score>=70)?"Good":(score>=60)? "Passed":"Failed":"Invalid";
        System.err.println(result2+" is the result");
        }
    }

