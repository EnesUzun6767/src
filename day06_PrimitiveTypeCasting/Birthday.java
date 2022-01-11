package day06_PrimitiveTypeCasting;

public class Birthday {
    public static void main(String[] args) {

        String name="Enes";
        int birthDay=19;
        String birthMonth="August";
        int birthYear=1984;

        String bookName="The Rich Dad and The poor Dad";
        System.out.println("My favorite book nameOfDay is = " + "\""+bookName+"\"");
        int x=100;
        byte y=(byte)x;
        double z=x;
        short r=(short)x;
        long f=x;
        float g=x;

        double a=13.33;
        int b=(int)a;
        short o=(short)a;
        long d=(long)a;

        System.out.println("d = " + d);
        System.out.println("o = " + o);
        System.out.println("b = " + b);
        
        System.out.println("+++++________-----------___________++++++++");
        System.out.println("f = " + f);
        System.out.println("r = " + r);
        System.out.println("z = " + z);
        System.out.println("g = " + g);
        System.out.println("+++++________-----------___________++++++++");
        System.out.println(name+" was born on "+birthMonth+"/"+birthDay+"/"+birthYear);
    }
}
/*
Create a class called BirthDay and create the following variable
             nameOfDay, birthDay(int), birthMonth(String), birthYear(int)

 */