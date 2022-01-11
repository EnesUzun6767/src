package day20_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class HighestFrequencyOfArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String result="";

        System.out.println("Enter the size of Array");
        int length=scan.nextInt();

      String[]character=new String[length];
        for (int i = 0; i < character.length; i++) {
            System.out.println("Enter a character");
            character[i]= scan.next();
        }
        System.out.println(Arrays.toString(character));

       String nonDup="";
        for (int i = 0; i < character.length; i++) {
           String ch=""+character[i];
           if(!(nonDup.contains(ch))){
               nonDup+=ch;
           }
        }
        System.out.println(nonDup);
        int[]counted=new int[nonDup.length()];
        String[]results=new String[nonDup.length()];

        for (int i = 0; i < nonDup.length(); i++) {
            int count=0;
            String ch=""+nonDup.charAt(i);

            for (int j = 0; j < length; j++) {
                String each=character[j];
                if(each.equals(ch)){
                    count++;
                }
            }
            result+=""+ch+count;
            counted[i]=count;
            results[i]=""+ch+count;
        }
        Arrays.sort(results);
        System.out.println(Arrays.toString(results));
        Arrays.sort(counted);
        System.out.println(Arrays.toString(counted));
        System.out.println(result);
        String charMax=results[nonDup.length()-1];

        System.out.println("The most repeated character is: "+charMax.charAt(0));
        System.out.println("The highest freq of repeated character is: "+counted[nonDup.length()-1]);
    }
}
