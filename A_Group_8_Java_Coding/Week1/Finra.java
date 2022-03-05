package A_Group_8_Java_Coding.Week1;

public class Finra {
    public static void main(String[] args) {
        String result = finra(46);
        System.out.println(result);
    }

    public static String finra(int a) {

        String result = "";
        for (int i = 1; i < a + 1; i++) {
            if (i % 15 == 0) {
                result += " FINRA ";
            } else if (i % 3 == 0) {
                result += " FIN ";
            } else if (i % 5 == 0) {
                result += " RA ";
            } else {
                result += " " + i + " ";
            }
        }
        return result;
    }
}