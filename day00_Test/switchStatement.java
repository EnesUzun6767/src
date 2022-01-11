package day00_Test;

public class switchStatement {
    public static void main(String[] args) {


    String word="merhaba";
    switch (word.charAt(0)){
        case 'a':
            System.out.println(1);
            break;
        case 'b':
            System.out.println(2);
        default:
            System.out.println(3);
        case'e':
            System.out.println(4);
        case'd':
            System.out.println(5);
            break;
        case't':
            System.out.println(6);
        }

    }
}
