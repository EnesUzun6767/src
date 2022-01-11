package day24_CustomMethod_Return;

public class EligibleToVote {
    public static void main(String[] args) {
        int age=34;
        int citizenship=1;
        String result=age_citizenship(age,citizenship);
        System.out.println(result);
        HowManyYears();
    }
    public static String age_citizenship(int age,int citizenship){
        String result="";
        if(age>19&&citizenship==1){
            result="is  eligible to vote";
        }else{
            result="is not eligible to vote";
        }
        return result;
    }
public static void HowManyYears(){
    System.out.println(2022-1984);
}

}
