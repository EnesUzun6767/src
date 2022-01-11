package day19_LoopPractise;

public class UniqueChar {
    public static void main(String[] args) {
        String str="aaaabbbbcddesrt";
        String result="";

        for (int i = 0; i < str.length(); i++) {
            int count=0;
            char general =str.charAt(i);
            if(result.contains(""+ general)){
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                char each =str.charAt(j);
                if(general == each) {
                    count++;
                    }

            }
            if (count==1){
                result+=""+ general;
            }
        }
        System.out.println(result);
    }
}
