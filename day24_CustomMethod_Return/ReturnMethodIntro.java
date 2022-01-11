package day24_CustomMethod_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        String str="cavac";
        String result=reverse(str);
        System.out.println(result);
        if(str.equals(result)){
            System.out.println(str+"is a palindrome");
        }else{
            System.out.println(str+"is not a palindrome");
        }

    }
    public static String reverse(String str){
        String reversed ="";
        for (int i=str.length()-1;i>=0;i--){
            reversed +=str.charAt(i);
        }
        return reversed;
    }
}
