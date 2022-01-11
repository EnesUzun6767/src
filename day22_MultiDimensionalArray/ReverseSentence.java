package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentences="Today is a good day for Java";
        String reversed="";

        String[]words=sentences.split(" ");
        System.out.println(Arrays.toString(words));

        for (int i = words.length-1; i>=0; i--) {
        reversed+=words[i]+" ";
        }
        System.out.println(reversed);

        String str = "Today is a good day to learn Java";
        String[] strSplit = str.split(" ");
        String strReverse = "";

        for (String each : strSplit) {
            strReverse = each + " " + strReverse;//
        }
        System.out.println(strReverse);
    }

}
