package day18_NestedLoop;

import java.util.Scanner;

public class goldenratio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        for(int i=10;i<1;i++){
            System.out.println("Day "+(i-1)+"["+inhabitants+"]");
            inhabitants/=2;
            if(inhabitants==0){
                break;
            }

        }

    }
}
