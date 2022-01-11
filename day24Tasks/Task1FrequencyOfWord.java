package day24Tasks;

import java.util.Locale;

public class Task1FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java java java python python";
        String word = "java";
        int frequency=frequencyOfWord(sentence,word);
        System.out.println(word+" repeats in sentence: "+frequency+"times");
    }
    public static int frequencyOfWord(String sentence,String word){
       int count=0;
       sentence=sentence.toLowerCase(Locale.ROOT);
        while(sentence.contains(word)){
            count++;
           sentence= sentence.replaceFirst(word,"");
        }
        return count;
    }
}
/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3

 */