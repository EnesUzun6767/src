package day24_CustomMethod_Return;

public class GradeOfStudent {
    public static void main(String[] args) {
        int score=96;
        char result=grade(score);
        System.out.println(result);

        String exam= result(87);
        System.out.println(exam);
    }
    public static char grade(int score){
        char grade='z';
        if(score>=90){
            grade='A';
        }else if(score>=80){
            grade='B';
        }else if(score>=70){
            grade='C';
        }else if(score>=60){
            grade='D';
        }else{
            grade='F';
        }
        return grade;
    }
    public static String result(int a){
        String result1="";
        if(a>=60){
            result1="passed";
        }else{
            result1="failed";
        }
        return result1;
    }
}
