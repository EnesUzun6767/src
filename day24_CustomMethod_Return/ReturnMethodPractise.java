package day24_CustomMethod_Return;

public class ReturnMethodPractise {
    public static void main(String[] args) {

    //find the max between 100~200
    int maxNumber=max(124,187);
        System.out.println("maxNumber = " + maxNumber);
    //then multiply by 2
        int multiplication=maxNumber*2;
        System.out.println(multiplication);

         }
    public static int max(int a,int b){
        int result=0;
        if(a>b){
            result=a;
        }else{
            result=b;
        }
        return result;
    }
}
