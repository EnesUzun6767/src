package day31_CustomClass_Constructor;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount();
        account1.setInfo("Enes Uzun",123456789);
        System.out.println(account1);
        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(900);
        account1.checkBalance();
        account1.deposit(1200);
        account1.checkBalance();
        System.out.println(account1);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        BankAccount account2=new BankAccount();
        account2.setInfo("Semra Uzun",1234544321);
        System.out.println(account2);
        account2.deposit(2000);
        account2.withdraw(200);
        account2.checkBalance();



    }
}
