package day20_Arrays;

import java.util.Arrays;

public class ExamplesArraysAlphabetics {
    public static void main(String[] args) {
        char[]alphabets=new char[26];//Z to A

    /*        i    j
     alphabets[0]='Z';
     alphabets[1]='Y';
     alphabets[2]='X';
        System.out.println(Arrays.toString(alphabets));
       */
       /* System.out.println(alphabets[0]);// for one elements
        System.out.println(alphabets[1]);
        System.out.println(alphabets[2]);*/
char ch='Z';
        for(int i=0;i< alphabets.length;i++,ch--){
            alphabets[i]=ch;
        }
        System.out.println(Arrays.toString(alphabets));
    }
}
