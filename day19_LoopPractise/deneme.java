package day19_LoopPractise;



public class deneme {
    public static void main(String[] args) {
        String str = "aabbbccdefff";
        String uniques = "";

        for (int i = 0; i < str.length() ; i++) {
            char each = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (each==ch){
                    frequency++;
                }

            }
            if (frequency==1){
                uniques+=each;
            }

        }

        System.out.println("Index of the first unique char: " + str.indexOf(uniques.charAt(0)));
        System.out.println(uniques);

    }
}
