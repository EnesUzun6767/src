package A_Group_8_Java_Coding.Week1;

public class DivisionManual {
    public static void main(String[] args) {
int dividend=division(27,4);
        System.out.println("dividend = " + dividend);

    }
    public static int division(int a, int b){
       if(b==0){
           throw new RuntimeException("!!!Denominator can not be ZERO !!!");
       }
        int count=0;
        while(a>=b){
            a-=b;
            count++;
        }
        return count;
    }
}
