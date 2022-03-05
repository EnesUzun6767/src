package A_Group_8_Java_Coding.Week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverseNegativeInt(-123));
    }

    public static int reverseNegativeInt(int a) {
        int remainder = 0;
        int result = 0;
        String s = "";
        if (a >= 0) {
            throw new RuntimeException("a should be negative");
        }
        a *= -1;
        while (a != 0) {
            s += "" + (remainder = a % 10);
            a /= 10;

        }
result=Integer.valueOf(s);
        return -result;
    }

}
