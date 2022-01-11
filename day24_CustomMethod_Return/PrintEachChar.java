package day24_CustomMethod_Return;

public class PrintEachChar {
    public static void main(String[] args) {
        String word="Hello Batch-25";
        word=printChar(word);
        System.out.println(word);

    }
    public static String printChar(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            result+="  "+str.charAt(i);

        }
        return result;
    }
}
