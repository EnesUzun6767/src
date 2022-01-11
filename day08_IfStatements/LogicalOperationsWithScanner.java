import java.util.Scanner;

public class LogicalOperationsWithScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your country:");
        String citizen=scan.nextLine();
        int age=37;
        String name="Enes";
         boolean isEligibleToVote=age>=18&&citizen.equalsIgnoreCase("Turkey");
        System.out.println(name+" is eligible to vote: "+isEligibleToVote);
    }

}
