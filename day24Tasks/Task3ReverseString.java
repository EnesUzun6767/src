package day24Tasks;

public class Task3ReverseString {
    public static void main(String[] args) {
        String word="My life be Like!";
        String reversed=reverse(word);
        System.out.println(reversed);

    }
    public static String reverse(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            result=str.charAt(i)+result;
        }
        return result;
    }
}
/*
create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ
 */