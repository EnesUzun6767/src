package day20_Arrays;

public class ClassmatesReverse {
    public static void main(String[] args) {
        String[]names={"Enes","Aykhan","Riza","Huseyin","Ozgul","Aohongjang","Victoria","Jonida","Asyl","Yasir"};
        String reverseNames="";

        for (int i = 0; i < names.length; i++) {
            for (int j = names[i].length() - 1; j >= 0; j--) {
                reverseNames = "" + names[i].charAt(j);

                System.out.print(reverseNames);
            }
            System.out.println();
        }
    }
}
