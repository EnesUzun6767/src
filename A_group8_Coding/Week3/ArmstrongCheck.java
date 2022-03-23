package A_Group_8_Java_Coding.Week3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArmstrongCheck {
    public static void main(String[] args) {
        armstrongCheck(153);   armstrongCheck(370);  armstrongCheck(371); armstrongCheck(54748);
        armstrongCheck(1634);

    }
    public static void armstrongCheck(int a){
        String value=""+a;
        int total=0,temp=0;
        ArrayList<String> list = new ArrayList<>(Arrays.asList(value.split("")));
        for (String each : list) {
            temp=Integer.parseInt(each);
            total+=Math.pow(temp, list.size());
        }
        if(a==total){
            System.out.println(a+" is an Armstrong number");
        }else{
            System.out.println(a+" is not Armstrong number");
        }

    }
}
