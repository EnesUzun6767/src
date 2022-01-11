package day30CustomMethods;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setInfo("Enes",'M',37,2020,'A');
        System.out.println(student1);
        Student student2=new Student();
        student2.setInfo("Hulya",'F',26,2123,'B');
        Student student3=new Student();
        student3.setInfo("Ali",'M',37,2021,'A');
        Student student4=new Student();
        student4.setInfo("Ahmet",'M',22,2100,'C');
        Student student5=new Student();
        student5.setInfo("Ayse",'F',24,2100,'B');
        Student[]student={student1,student2,student3,student4,student5};
        for (Student each:student) {
            System.out.println(each);
        }
        ArrayList<Student>earlyBird=new ArrayList<>();//gradeA
        ArrayList<Student>angryBird=new ArrayList<>();
        for (Student each:student){
            if(each.grade=='A'){
                earlyBird.add(each);
            }else{
                angryBird.add(each);
            }
        }
        System.out.println(earlyBird);
        System.out.println(angryBird);
    }

}
