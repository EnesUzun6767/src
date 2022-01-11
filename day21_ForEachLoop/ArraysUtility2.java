package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 2);

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[]num2=Arrays.copyOf(numbers,7);// 7 uzunlukta aliyor.
        System.out.println(Arrays.toString(num2));

        numbers = Arrays.copyOf(numbers, 4); //{1,2,3,4}
        System.out.println(Arrays.toString(numbers));




        System.out.println("--------------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6 );// last is not included

        System.out.println(Arrays.toString(ch2));

        char[]ch3=Arrays.copyOf(ch1,5);
        System.out.println(Arrays.toString(ch3));

        char[]ch4=Arrays.copyOfRange(ch1,2,7);
        System.out.println(Arrays.toString(ch4));


        int[] scores={10,20,30,40,50,60,70,80,90,100};
                   // 0  1  2   3 4  5  6  7   8   9
        int[]result=Arrays.copyOfRange(scores,3,7+1);
        System.out.println(Arrays.toString(result));

        int[]result2=Arrays.copyOfRange(scores,4,scores.length);
        System.out.println(Arrays.toString(result2));

        System.out.println("-----------------------------------------------");
int[] num3={2,3,4,5,6,7};
for(int each:num3){
    System.out.print(each+" ");
}




    }
}
