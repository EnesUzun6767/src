package day00_Test;

import java.util.ArrayList;

public class Aa {
   private String brand ;

    @Override
    public String toString() {
        return "Aa{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            throw new RuntimeException("Invalid Entry");
        }

            this.brand = brand;
        }

    public Aa(String brand) {
        setBrand(brand);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2,13,3, 13, 5,8,4, 13,7,13,7,13,13,13,2,13};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != 13) {
                list.add(arr[i]);
            }
            if(arr[i]==13 && arr[i+1]==13){
                i+=2;
                continue;
            }
            if (arr[i] == 13) {
                i++;
                continue;
            }


        }

        int sum = 0;
        for (Integer each : list) {
            sum += each;
        }
        System.out.println(list);
        System.out.println("sum = " + sum);


    }
}