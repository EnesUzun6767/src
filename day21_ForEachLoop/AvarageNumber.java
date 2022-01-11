package day21_ForEachLoop;

public class AvarageNumber {
    public static void main(String[] args) {
        int[]numbers={3,5,2,22,32,5,6,0,5,10};
        double sum=0;
        for (int number : numbers) {
           sum+=number;
        }
        System.out.println(sum);
        double avarage=sum/numbers.length;
        System.out.println(avarage);
    }
}
