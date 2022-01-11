package day18_NestedLoop;

import java.util.Scanner;

public class RepaAtinG {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter word");
        String word=scan.next();
        String nonRep ="";
        String result="";
        for (int i = 0; i < word.length(); i++) {
            String ch = "" + word.charAt(i);
            while (!(nonRep.contains(ch))) {
                nonRep += ch;
            }
        }
        System.out.println(nonRep);

        for (int i = 0; i < nonRep.length(); i++) {
          char ch=nonRep.charAt(i);
            int count=0;
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(j)==ch){
                    count++;
                }
            }
            result+=""+ch+count;
        }

        System.out.print(result);
        }

    }
