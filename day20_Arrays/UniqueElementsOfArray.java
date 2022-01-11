package day20_Arrays;

public class UniqueElementsOfArray {
    public static void main(String[] args) {
        String[] words = {"Java", "Java", "C#", "Phyton", "Phyton"};


        for (int j = 0; j < words.length; j++) {
            String each = words[j];
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(each)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each);
        }
        }
    }
}
