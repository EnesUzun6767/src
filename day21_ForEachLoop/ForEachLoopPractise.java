package day21_ForEachLoop;

public class ForEachLoopPractise {
    public static void main(String[] args) {
        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};
        for (String word : words) {
            System.out.print(word.charAt(0)+""+word.charAt(word.length()-1)+" ");
        }
   
    }
}
