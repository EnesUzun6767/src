package A_Group_8_Java_Coding.Week3;

import java.util.ArrayList;
import java.util.Arrays;

public class reversedMethod {
    public static void main(String[] args) {
        System.out.println(reversed(-1258));
    }
    public static int reversed(int num){

        String number=""+num;

        ArrayList<String> list=new ArrayList<>(Arrays.asList(number.split("")));
        String result="";

        for (Integer i =list.size()-1 ; i >0 ; i--) {
            result+=list.get(i);
        }

        int reversed= Integer.parseInt("-"+result);
        return reversed;
    }
}
