package day07_Operators;

public class LogicalOperations {
    public static void main(String[] args) {
        String name="Ahmet";
        int age=12;
        char gender='M';
        boolean isEligible=age>=11&&(gender=='M'||gender=='F');
        System.out.println(name+"  is eligible to play outside: "+isEligible);

        int age1=25;
        int creditScore=720;
        boolean hasAjob=true;
        boolean isEligible2= age1>=18 && creditScore>=700 &&hasAjob==true;
        System.out.println(name+ " is eligible to get credit:"+isEligible2);

        boolean result2=true;
        boolean result1=!result2;
        System.out.println(result1);

        System.out.println("____-------_________-----__-_-_-_-_");

        int score=65;
        boolean passed=score>59;
        boolean failed=!passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

    }
}
