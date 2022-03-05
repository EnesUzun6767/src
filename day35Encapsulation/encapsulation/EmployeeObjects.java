package day35Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("Enes",'K',38,123000);
        System.out.println(employee1);
        employee1.setAge(32);
        System.out.println(employee1);
        Employee employee2=new Employee("Ahmet",'M',18,125000);
        employee2.setSalary(employee2.getSalary()+15000);
        System.out.println(employee2);
        employee1.setName("EnesKral");
        System.out.println(employee1);
    }

}
