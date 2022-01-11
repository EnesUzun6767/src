package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            if (i == 'f') {
                //System.out.print(i+", ");   f dahil yazidirir.
            break;
            }
            System.out.print(i+" ");
        }
        Scanner scan=new Scanner((System.in));
while(true){
    System.out.println("enter a number");
    int number=scan.nextInt();
    if(number<0){
        break;
    }

}

    }
}