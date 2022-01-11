package day09_IfStatement;

public class Max_Min_Eligible {
    public static void main(String[] args) {
        int x = 10, y = 20;
        if (x > y) {
            System.out.println(x + " is maximum");
        } else {
            System.out.println(y + "is maximum");
        }
        if (x < y) {
            System.out.println(x + " is minimum");
        } else {
            System.out.println(y + "  is minimum");
        }
        int age = 23;
        boolean hasID = true;
        if (age > 21 && hasID) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }

    }
}