package day14_String;

import java.util.Scanner;

/*
 4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */
public class Task4_First_Last {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first word");
        String word1= scan.next();

        System.out.println("Enter second line");
        String word2=scan.next();

        String chLast=""+word1.charAt(word1.length()-1);
        String chFirst=""+word2.charAt(0);
        String result=""+word1.substring(0,word1.length()-1)+word2;

        if(chLast.equalsIgnoreCase(chFirst)){
            System.out.println(result);
        }
    }
}
