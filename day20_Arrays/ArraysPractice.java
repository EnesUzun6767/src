package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[]numbers={2,1,3,4};
        System.out.println(Arrays.toString(numbers));
        System.out.println("------------------------");
        int[]scores=new int[5];
       scores[0]=85;
       scores[1]=98;
       scores[2]=86;
       scores[3]=90;
       scores[4]=89;
        System.out.println(Arrays.toString(scores));

        int[]num=new int[4];
        for (int i=0,j=25;i< num.length;i++,j++){
            num[i]=j;
        }
        System.err.println(Arrays.toString(num));
    }
}
