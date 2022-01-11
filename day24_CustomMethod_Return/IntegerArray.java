package day24_CustomMethod_Return;

public class IntegerArray {

    public static void main(String[] args) {
        int[] numbers={1,3,4,2,6,7,8,9,11,5};
       int number=elementsOfArray(numbers);

    }
    public static int elementsOfArray(int[] numbers){

        for (int integers : numbers) {
            System.out.print(integers+" ");
        }
        return 0;
    }
}
