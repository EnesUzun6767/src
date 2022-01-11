package day31_CustomClass_Constructor.ScrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
//4 testers Objects
        Tester tester1=new Tester("Enes",12345,"QA",110000);
        Tester tester2=new Tester("Ahmet",12346,"QA",120000);
        Tester tester3=new Tester("Eymen",12347,"QA",130000);
        Tester tester4=new Tester("Semra",12348,"QA",140000);
        Tester[]testers={tester2,tester3,tester4};
//4 developers Objects
Developer developer1=new Developer("Ahmet",22,"Java Developer",125000);
Developer developer2=new Developer("Samet",23,"Java Developer",180000);
Developer developer3=new Developer("Rabia",28,"Java Developer",135000);
Developer developer4=new Developer("Fatma",44,"Java Developer",220000);
Developer[]developers={developer2,developer3,developer4};
//1 ScrumTeam Object
ScrumTeam scrum =new ScrumTeam("Satilmis","Huseyin","Nadir",14) ;

scrum.addTester(tester1);
scrum.addDeveloper(developer1);
scrum.addTesters(testers);
scrum.addDevelopers(developers);
        System.out.println(scrum);
        System.out.println("---------------Testers List---------------------");
        for (Tester eachTester: scrum.testerList) {
            System.out.println(eachTester.name+" "+eachTester.salary);
        }
        System.out.println("---------------Developers List---------------------");
        for (Developer  eachDeveloper: scrum.developersList) {
            System.out.println(eachDeveloper.name+"  "+eachDeveloper.salary);
        }
        System.out.println("-------------------remove developer---------------");
        scrum.removeDeveloper(22);
        scrum.removeTester(12346);
        System.out.println(scrum.testerList);
        System.out.println(scrum.developersList);
    }
}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */