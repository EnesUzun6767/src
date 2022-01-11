package day15_For_Loop;

public class Sum_of_Even {
    public static void main(String[] args) {
        int sum=0;
        for(int i=2;i<=100;i+=2){
            sum+=i;

        }
        System.out.println(sum+" is the sum of even numbers");
    }
}
