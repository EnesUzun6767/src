package A_Group_8_Java_Coding.Week1;

public class OddEven {
    public static void main(String[] args) {
        oddEven(57);
    }
    public static void oddEven(int a){
        if(a%2==0){
            System.out.println(a+" is even number" );
        }
        if(a%2==1){
            System.out.println(a+" is odd number");
        }
    }
}
