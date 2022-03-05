package day00_Test;

import day46_Polymorphism.A;

import java.util.ArrayList;

public class ArrayListODD {
    public static void main(String[] args) {
int arr[]={1,3,4,5,6,7};
      ArrayList<Integer> array=oddNumbers(arr);
        System.out.println(array);
    }
    public static ArrayList<Integer> oddNumbers(int[] arr){
       ArrayList<Integer>a=new ArrayList<>();
    for (int each : arr) {
            if(each%2==1){
                a.add(each);
            }

        }
return a;
    }
}
