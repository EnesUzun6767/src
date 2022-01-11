package day14_String;

import java.util.Scanner;

/*
Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */
public class Task3_X_Trim {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);

        System.out.println("Enter a word");
        String word=scan.next();
        String ch=""+word.charAt(0);


        if(ch.equalsIgnoreCase("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }
    }
}
