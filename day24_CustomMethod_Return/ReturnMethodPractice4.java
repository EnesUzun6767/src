package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
String str="aaaaabbbbbcddddeeeessss";
String last =removeDuplicates(str);
        System.out.println(last);

    }

    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
String each=""+str.charAt(i);
if(!(result.contains(each))){
    result+=each;

}
        }
        return result;


    }
}
