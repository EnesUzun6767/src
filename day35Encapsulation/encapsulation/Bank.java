package day35Encapsulation.encapsulation;

public class Bank {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Bank(String accountHolder, int accountNumber, double balance) {
        setAccountHolder(accountHolder);
       setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

public void deposit(double amount){
        if(amount<=0) {
            System.out.println("Invalid deposit");
            return;
        }else{
            balance+=amount;
        }
}
public void withdraw(double amount){
        if(amount<=0||amount>balance){
            System.out.println("Invalid request");
            return;
        }else{
            balance-=amount;
        }
}
public double checkBalance(){
        return balance;
}

    public String toString() {
        return "Bank{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        Bank person=new Bank("Kazim",122345321,1200);
        person.deposit(12);
        System.out.println(person.balance);
        person.withdraw(-12);
        System.out.println(person.balance);
    }
}

/*
3. create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        day36_Inheritance.encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()

            DO NOT duplicate any code fragments

 */
