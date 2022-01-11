package day32Constructor;

import javax.crypto.spec.PSource;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("Enes");
        System.out.println(employee1);
        Employee employee2=new Employee("ENES",'M');
        System.out.println(employee2);
        Employee employee3=new Employee("ENES",'M',"SDET");
        System.out.println(employee3);
        Employee employee4=new Employee("Enes",'M',"SDET",200_000);
        System.out.println(employee4);
    }


}
