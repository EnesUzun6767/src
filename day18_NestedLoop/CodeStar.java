package day18_NestedLoop;

public class CodeStar {
    public static void main(String[] args) {
        String star = "";
        for (int j = 0; j <10; j++) {

            for (int i = 0; i < 10; i++) {
                System.out.print("*");// 10 tane yazdirdi
            }
            System.out.println();//siradaki boslukta devam ettirdi 10 sira yildizi
        }
    }
}