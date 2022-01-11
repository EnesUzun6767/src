package day03_EscapeSequences;

import jdk.swing.interop.SwingInterOpUtils;

/* Escape sequences : Must be given with double quote
\n:starts a new line
\t:paragraph space (tab button)
\\: it prints one back slash
\":
 */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java\nPhyton\nC#");
        System.out.println("Hello Cydeo\nHow are you all today?\nIt is nice to see You again\nWhat class do we do next week?");

        System.out.println("\tJava is cool Programming Language");
        System.out.println("/\\");// inorder to print one backward slash we need to use two backward slash
        System.out.println("My favorite game is \"Soccer\"");

    }
}

