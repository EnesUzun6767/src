package day18_NestedLoop;

import java.util.Scanner;

public class Repeating {
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
                int count=0;
                String last="";
                for (int j = 0; j < nonRep.length(); j++) {
                    String ch1 =""+nonRep.charAt(j);
                    while(word.contains(ch1)) {
                        count++;
                        word = word.replaceFirst(ch1, "");
                    }
                    last=ch1+count;
                    System.out.print(last) ;
                }

            }
    }

