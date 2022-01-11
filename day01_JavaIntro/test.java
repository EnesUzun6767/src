package day01_JavaIntro;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = "";
        int i = str.length();
        int j = 0;
        if(str.length()==3){
            if(str.charAt(0)==str.charAt(2)){
                System.out.println(str.charAt(0));
            }


        }
        while (str.charAt(i - 1) == str.charAt(j)) {
            result += str.charAt(j);
            i--;
            j++;
        }
        System.out.println(result);
    }
}



      

