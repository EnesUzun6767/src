package day00_Test;

public class Testx {
    public Testx(){
        this(10);
        System.out.println("A");
    }
    public Testx(int a){
        System.out.println("B");
    }




    public static void main(String[] args) {
        Testx test1=new Testx();
    }
}
