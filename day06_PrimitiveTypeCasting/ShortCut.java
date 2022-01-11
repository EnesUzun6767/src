package day06_PrimitiveTypeCasting;

public class ShortCut {
    public static void main(String[] args) {

        double x=20.5; // short cut view on the right says cast
        short s= (short) x;
        float e= (float) x;
        int a= (int) x;
        int c= (int) x;
        long g= (long) x;
        System.out.println(x+": "  + g);
        System.out.println(x+": "  + c);
        System.out.println(x+": "  + a);
        System.out.println(x+": "  + e);

    }
}
