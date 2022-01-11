package day10_NestedIf;

public class Nested_If_Intro {
    public static void main(String[] args) {
        int score = 43;
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
                if(score>=90){
                    System.out.println("Excellent");
                }else if(score>=80){
                    System.out.println("Great");
                }else if(score>=70){
                    System.out.println("Good");
                }else if(score>=60){
                    System.out.println("Passed");
                }
            } else {
                System.out.println("failed");
            }
        } else {
            System.out.println("Invalid number");
        }
    }
}
