package day24_CustomMethod_Return;

public class Convert$EuroLiraKg {
    public static void main(String[] args) {
        int dollar=35;
        int kg=25;
       double euro=moneyDollar2Euro(dollar);
        System.out.println(dollar+"$ is "+euro+" Euro");
        double lira=moneyDollar2Lira(dollar);
        System.out.println(dollar +"$ is "+lira+" Lira");
        double lb=kg2lb(kg);
        System.out.println(kg+" kg is "+lb+" lb");
double para=convertMoney(3);
        System.out.println(3+" is "+para);
        }

    public static double moneyDollar2Euro(int dollar){
        double result=0.88*dollar;
        return result;
    }
    public static double moneyDollar2Lira(int dollar){
        double result=13.88*dollar;
        return result;
    }
    public static double kg2lb(int kg){
        double result=2.204*kg;
        return result;
    }
    public static double convertMoney(int x){
        double y=x*2.5;
        return y;
    }
}
