package day21_ForEachLoop;

public class MinNumber {
    public static void main(String[] args) {
        int[]numbers={1,2,3,5,-6,-11};
        int min=0;
        for (int number : numbers) {
            if (number < min) {
                number = min;
            }
        }
            System.out.println(min);

    }
}
