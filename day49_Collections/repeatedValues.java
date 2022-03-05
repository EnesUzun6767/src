package day49_Collections;

import java.util.*;

public class repeatedValues {
    public static void main(String[] args) {
        String str = "eeeeeaaaabbbbccccdddeeeee";
        //  eabcd
        //  104434
        str=repeated(str);
        System.out.println("str = " + str);
        
    }
public  static String repeated(String str){
        String result="";
    List<String> wholeList =new ArrayList<>(Arrays.asList(str.split("")));
    Set<String> nonRepeated =new LinkedHashSet<>(wholeList);
    for (String each: nonRepeated) {

        int freq=Collections.frequency(wholeList,each);
        result+=each+freq;
    }
        return result;
        
}

}
