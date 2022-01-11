package day04_Variables;

import javax.lang.model.SourceVersion;

public class Currencies {
    public static void main(String[] args) {
        int dollar=1000;
        double lira=dollar*9.53;
        double euro=dollar*1.16;
        double jpy=dollar*114;
        double pound=dollar*0.73;
        double CAD=dollar*1.24;

        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("jpy = " + jpy);
        System.out.println("pound = " + pound);
        System.out.println("CAD = " + CAD);


    }
}
