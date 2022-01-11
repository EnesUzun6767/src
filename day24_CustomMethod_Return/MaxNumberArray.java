package day24_CustomMethod_Return;

public class MaxNumberArray {
    public static void main(String[] args) {
        int[]numbers={12,32,43,55,1,6,7};
      int max= maxNumber(numbers);
        System.out.println(max);

    }
    public static int maxNumber(int[] numbers ){
       int max=numbers[0];
        for (int each:numbers) {
            if(each>max){
                max=each;
            }

        }
       return max;
    }
}
//2.create a method that can return the maximum number from an array of integers