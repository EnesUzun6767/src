package day18_NestedLoop;

public class division {
    public static void main(String[] args) {
        int a=30;
        int b=4;
        int count=0;
        while(!(b>a)){
            a-=b;
            count++;
        }
        System.out.println(count+" with a remainder of a"+a);
    }
}
