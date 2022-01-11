package day00_Test;

import java.util.Arrays;

public class quartile {
    public static void main(String[] args) {
       double[]num1={1,3,4,6,12,5,7,8,17};
       double med=median(num1);
        System.out.println(med);
    }
    public static double median(double[]num){
       double median=0;
        Arrays.sort(num);
        if(num.length%2==1){
median= num[num.length/2];
        }else{
            median=(num[num.length/2-1]+num[num.length/2])/2;
        }
        return median;
    }
    }

