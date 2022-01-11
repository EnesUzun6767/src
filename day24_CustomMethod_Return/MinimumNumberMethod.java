package day24_CustomMethod_Return;

public class MinimumNumberMethod {
    public static void main(String[] args) {
        int[]number={1,3,-2,4,-7,9};
        int minimum=minimumNumber(number);
        System.out.println(minimum);

    }
    public static int minimumNumber(int[] numbers){
       int min=numbers[0];
        for (int each:numbers) {
            if(each<min){
                min=each;
            }
        }
        return min;
    }
}
//3.create a method that can return the minimum number from an array of integers