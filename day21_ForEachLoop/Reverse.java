package day21_ForEachLoop;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};
        String reverse="";

        for (String name : names) {
            for (int i = name.length()-1; i >= 0; i--) {
                reverse += name.charAt(i);
            }
        }
        System.out.println(reverse+", ");
    }
}
