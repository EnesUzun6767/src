package A_Group_8_Java_Coding.Week5;

public class Inverse_Of_String {
    public static void main(String[] args) {
        String str="Good_Morning";
        String reverse = reverseString(str);
        System.out.println("reverse = " + reverse);

    }
    public static String reverseString(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }
}



/*
String -- Reverse
Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
 */