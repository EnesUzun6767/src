package day00_Test;

public class wordIndex {
    public static void main(String[] args) {
        String str="I love java and Java";
        for(int i=0;i<str.length();i++){
            if(str.substring(i,i+4).equals("Java")){
                System.out.println(i);
                break;
            }
        }
    }
}
// finding index of given letter without using indexOf Method