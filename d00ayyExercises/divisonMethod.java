package d00ayyExercises;

public class divisonMethod {
    public static void main(String[] args) {
        int result = dividend(6, 10);
        System.out.println("result = " + result);
    }

    public static int dividend(int a, int b) {
        int count = 0;
        if(b>a){
            throw new RuntimeException("denominator can not be greater than numeretor");
        }
        if(b==0){
            throw new RuntimeException("denominator can not be zero");
        }
        while(b<=a){
            a=a-b;
            count++;
        }
        return count;
    }
}