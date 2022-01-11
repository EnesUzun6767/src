package day24_CustomMethod_Return;

public class UniqueCharMethod {
    public static void main(String[] args) {
String str="aaaaaebbbbbnssssxxx";
str=unique(str);
        System.out.println(str);
    }
    public static String unique(String words){
        String result="";
        for (int i=0;i<words.length();i++){
            String ch=""+words.charAt(i);
            if(words.indexOf(ch)==words.lastIndexOf(ch)){
                result+=ch;
            }
        }
        return result;
    }
}
//1. create a method that can return the unique characters of a string