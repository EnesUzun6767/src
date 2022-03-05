package day40_FinalKeyword;

public class FinalVariable {
    final  String birthDay;
    final static String name;
    static {
        name="Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {
       final double pi=3.14;
       //pi=2.13 ;  final variable can not be reassigned;
        final String name;
        name="Java";
       // name="Enes";
        System.out.println(name);

        System.out.println("      ---           ");
        FinalVariable obj=new FinalVariable("August/19");
      // obj.birthDay="June/01";  final variable can not be assigned second time.
       //  FinalVariable.name="Phyton"; we can not re-assigned
        System.out.println(obj.birthDay);
        System.out.println(FinalVariable.name);
    }
}
