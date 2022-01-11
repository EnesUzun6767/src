package day17_While_DoWhile;

public class Frequency_Of_WordWhiLeLoop {
    public static void main(String[] args) {
        String str="Java Java  Java Phyton  Java Phyton";
        int frequency=0;
        while(str.contains("Java")){
            str=str.replaceFirst("Java","");
        frequency++;
        }
        System.out.println("Java repats: "+frequency);
        System.out.println("========================");
        String name="cat dog cat cat dog cat cat dog dog cat";
        int count1=0;
        int count2=0;

        while(name.contains("cat")){
            name=name.replaceFirst("cat","");
            count1++;
        }
        System.out.println("cat repeats = " + count1);
        while(name.contains("dog")){
            name=name.replaceFirst("dog","");
            count2++;
        }
        System.out.println("dog repeats = " + count2);
    }
}
