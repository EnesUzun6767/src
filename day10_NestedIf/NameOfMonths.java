package day10_NestedIf;

import org.w3c.dom.ls.LSOutput;

public class NameOfMonths {
    public static void main(String[] args) {


        int month = 5;

        String result = (month == 1) ? "Janurary" : (month == 2) ? "February" : (month == 3) ? "March"
                : (month == 4) ? "April" : (month == 5) ? "May" : (month == 6) ? "June" : (month == 7) ?
                "July" : (month == 8) ? "August" : (month == 9) ? "September" : (month == 10) ?
                "October" : (month == 11) ? "November" : "December";
        System.out.println(result);
    } // () is not mandatory.
}