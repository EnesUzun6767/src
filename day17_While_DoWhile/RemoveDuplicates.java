package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AABBCC";
        String result = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;
        }
        System.out.println(result);
    }
}