package day00_Test;

public class Prime {
    public static void main(String[] args) {
        int num = 15;
        boolean result=true;
        if(num<2){
            System.out.println(!result);
            System.exit(0);
        }
        if(num==2){
            System.out.println(result);
            System.exit(0);
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                result=false;
            }

        }
        System.out.println(result);
    }
}
