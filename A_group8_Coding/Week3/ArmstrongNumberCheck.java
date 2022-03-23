package A_Group_8_Java_Coding.Week3;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        int x=153;
        armstrongChecker(x);

    }
    public static void armstrongChecker(int a){
        int number,temp,total=0;
        number=a;
        while (number!=0){
            temp=number%10;
            total+=temp*temp*temp;
            number/=10;
        }
        if(total==a){
            System.out.println(a+" is an Armstrong number");
        }else{
            System.out.println(a+" is not Armstrong number");
        }

    }
}
//153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.