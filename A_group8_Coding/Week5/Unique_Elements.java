package A_group8_Coding.Week5;

public class Unique_Elements {
    public static void main(String[] args) {
        String str="aaaabbbbbddddefnféfs";
        String uniques=unique(str);
        System.out.println("uniques = " + uniques);
    }
    public static String unique(String str){
        String unq="";
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                unq+=str.charAt(i);
            }
        }
        return unq;
    }
}




/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */