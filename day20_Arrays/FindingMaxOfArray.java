package day20_Arrays;

public class FindingMaxOfArray {
    public static void main(String[] args) {


        int[] numbers = {2, 34, 54, 6, 7, 89, 21, 78};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
if(numbers[i]>max){
    max=numbers[i];
            }

        }
        System.out.println(max);
    }
}
//numbers.forr
//  for (int i1 = numbers.length - 1; i1 >= 0; i1--) {