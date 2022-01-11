package day19_LoopPractise;

public class FrquencyChar {
    public static void main(String[] args) {
        String str="aabccdaaaa";
        String result="";

        for (int j = 0; j < str.length(); j++) {
            char ch=str.charAt(j);

            if(result.contains(""+ch))
              continue;

            int count=0;
            for (int i = 0; i < str.length(); i++) {
                char each=str.charAt(i);
                if(ch==each){
                    count++;
                }

        }
            result+=""+ch+count;
        }
        System.out.println(result);

    }
}
