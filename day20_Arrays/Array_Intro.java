package day20_Arrays;

import java.util.Arrays;

public class Array_Intro {
    public static void main(String[] args) {

        String[]students=new String[10];
        int[]says={2,3,4,5,7,8,11};
        System.out.println(Arrays.toString(says));

        System.out.println(says.length);

        String[] myGroup=new String[5];
        String[]names={"kedi","mavi"};
        myGroup[0]="Gunay";
        myGroup[1]="Enes";
        myGroup[2]="Ahmet";
        myGroup[3]="Samet";
        myGroup[4]="Ekrem";
        System.out.println(Arrays.toString(myGroup));
        System.out.println("-----------------------");
        String[] days={"Mon","Tues","Wed","Thur","Friday","Sat","Sun"};
        System.out.println(Arrays.toString(days));
       // System.out.println(days);  comp error
int num=12;
if(num<1||num>7){
    System.err.println("Invalid");
}
        System.out.println(days[2]);
    }
}
/*
Data structures: to use the data efficiently,store
 data values noon primitive:null
 primitive:  byte short int long==>0
boolean==>false;
double==>0.0
 */