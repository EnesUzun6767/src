package day00_Test;

import day17_While_DoWhile.PasswordUsername;

public class Tez {
    public Tez(){
        System.out.println("A");
    }
    public Tez(int a){
        this();
        System.out.println("B");
    }
    public Tez(String str){
        this(100);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Tez obj=new Tez("enes");
    }
}
