package day24_CustomMethod_Return;

public class UniqueElementsOfArray {
    public static void main(String[] args) {
        String[] word = {"Java", "C#", "Java", "Phyton", "C++"};
        String once = unique(word);
        System.out.println(once);
    }

    public static String unique(String[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            String ch = "" + arr[i];

            if (result.contains(ch)) {
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                String each = "" + arr[j];
                if (each.equals(ch)) {
                    count++;

                }

            }
            if (count == 1) {
                result +=" "+ ch;
            }
        }
        return result;
    }
}
//create a method that can return the unique elements of array