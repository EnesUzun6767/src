package day24Tasks;

public class Task4IsPalindrome {
    public static void main(String[] args) {
String word="level";
boolean result=isPalindrome(word);
        System.out.println(result);
    }
    public static boolean isPalindrome(String word){
        boolean result=true;
        String reversed="";
        for (int i = 0; i < word.length(); i++) {
            reversed=word.charAt(i)+reversed;
        }
        if(word.equals(reversed)){
            result=true;
        }else{
            result=false;
        }
return result;
    }
}
