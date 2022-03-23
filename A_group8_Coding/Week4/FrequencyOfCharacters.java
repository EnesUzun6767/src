package A_Group_8_Java_Coding.Week4;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="aaabbbbcdddeeessssaaa";
        System.out.println("frequencyOfLetters(str) = " + frequencyOfLetters(str));
    }
    public static String frequencyOfLetters(String str){
        String result="";
        Map<String, Integer> map= new LinkedHashMap<>();
        ArrayList<String >list = new ArrayList<>(Arrays.asList(str.split("")));
        for (String each : list) {
            int frequency= Collections.frequency(list,each);
            map.put(each,frequency);
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            result+=pair.getKey()+""+pair.getValue();
        }

        return  result;
    }
}
/*
: String -- Frequency of Characters
• Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

