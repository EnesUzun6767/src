package day30CustomMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        Employee employee5=new Employee();

        employee1.setInfo("Enes",'M',38,1453,"SDET",120_000,true);
        employee2.setInfo("Semra",'F',37,1234 ,"QA",125_000,true);
        employee3.setInfo("David",'M',35,2256,"QA",45000,false);
        employee4.setInfo("Lina",'F',45,2290,"Manager",80000,false);
        employee5.setInfo("Kevin",'M',35,2298,"Senior QA", 110000,true);

        Employee[]employees={employee1,employee2,employee3,employee4,employee5};
        int countFullTime =0;
        int countPartTime =0;
        double max=employee1.salary;
        double min= employee1.salary;
        for (Employee each : employees) {
            if(each.isFullTime){

                countFullTime++;
            }else{
                countPartTime++;
            }
            if(max< each.salary){
                max=each.salary;
            }
            if(min> each.salary){
                min=each.salary;
            }
        }
        System.out.println(countFullTime +" employee is full time");
        System.out.println(countPartTime+" employee is part time");
        System.out.println(max+" is maximum salary");
        System.out.println(min+" is minimum salary");
        Employee[] fullTime=new Employee[countFullTime];
        Employee[]partTime=new Employee[countPartTime];
        int i=0,j=0;
        for (Employee each : employees) {
            if(each.isFullTime){
                fullTime[i]=each;
                i++;
            }else{
                partTime[j]=each;
                j++;
            }

        }
        System.out.println("fullTime"+Arrays.toString(partTime));
        System.out.println("partTime"+Arrays.toString(fullTime));
    }
}
