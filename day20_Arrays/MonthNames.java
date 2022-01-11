package day20_Arrays;

import java.util.Arrays;

public class MonthNames {
    public static void main(String[] args) {
        String [] months={"Jan","Feb","Mrch","Ap","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        for (int i = 0; i < 11; i++) {
            System.out.println(months[i]);
        }
        System.out.println(Arrays.toString(months));

        int number=4;
        System.out.println(months[number-1]);
        for (int i = 0; i < months.length; i+=2) {
            System.out.print(months[i]+", ");
        }
    }
}
