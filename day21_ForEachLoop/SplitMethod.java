package day21_ForEachLoop;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words="I love Java Programming language";
        String[]sentences=words.split(" ");

        System.out.println(Arrays.toString(sentences));
        String email="WoodenSpoon@gmail.com";
       String[]arr= email.split("@");
        System.out.println(Arrays.toString(arr));
        String str="Today is nice day.Today is Monday.Today we learn Java";
        String[]s=str.split("\\.");
        System.out.println(Arrays.toString(s));

    }
}
