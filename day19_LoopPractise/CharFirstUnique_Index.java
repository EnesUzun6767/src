package day19_LoopPractise;
//index of first unique character;
import java.util.Scanner;

public class CharFirstUnique_Index {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String result="";

        System.out.println("Enter a string");
        String str=scan.next();
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            char general=str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char each=str.charAt(j);
                if(general==each){
                    count++;
                }
            }
            if(count==1){
                result+=general;
            }
        }
        System.out.println(str.indexOf(result.charAt(0)));
        System.out.println(result);
    }
}
