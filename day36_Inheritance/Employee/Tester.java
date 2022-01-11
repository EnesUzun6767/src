package day36_Inheritance.Employee;

public class Tester extends Employee {
    public void testing(){
        System.out.println(name+" is testing");
    }
    public void creatingTicket() {
        System.out.println(name+" is creating ticket");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.setInfo("Enes","SDET",'M',123321,250000);

        System.out.println(tester1);
        tester1.work();
        tester1.creatingTicket();
        tester1.testing();
    }

}
/*
2.2 Create the subclass of Employee named Tester:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				testing()
				creatingTicket()
				toString()
 */