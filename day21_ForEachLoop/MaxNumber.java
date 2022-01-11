package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {
        int[]numbers={3,5,2,22,32,5,6};
        int max=numbers[0];
        for (int number : numbers) {
            if(number>max){
           number=max;
            }
            System.out.println(number);
        }
    }
}
