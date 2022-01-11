package day24_CustomMethod_Return;

public class task1RemoveDuplicates {
    public static void main(String[] args) {
        String str="aaaaaabbbbbbbbbcccccccccccddddddd";
        str=nonDuplicate(str);
        System.out.println(str);
    }

    public static String nonDuplicate(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            String ch=""+str.charAt(i) ;
                if(!(result.contains(ch))){
                result+=ch;
            }
        }
        return result;
    }


}
//1. create a method that can remove duplicated characters from a string and returns the new value