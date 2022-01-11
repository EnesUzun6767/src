package day06_PrimitiveTypeCasting;

public class Primitive_Explicit_Casting {
    public static void main(String[] args) {
        //d>f>l>i>s>b
        int x=50;
        short y=(short)x;
        byte z=(byte)y;

        System.out.println("z = " + z);
        System.out.println("y = " + y);
     
        long a=1000;
        short b=(short)a;
        byte c=(byte)b;  // range matter if it is more than range turns to negative answer
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        System.out.println("+++++++___________-----------__----------++++++");
       
         double p=10.04;
         float l=(float)p;
         long k=(long)l;
         int w=(int)k;
         short m=(short)w;

        System.out.println("w = " + w);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
         
    }
}
