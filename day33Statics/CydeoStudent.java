package day33Statics;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;
    public int ID;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public static String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, int ID, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study() {
        System.out.println(name+"is studying");
    }
    public void attendClass(){
        System.out.println(name+"has attended in class");
    }
    public static void printSchoolName(){
        System.out.println(CydeoStudent.schoolName);
    }
    public static void printProgrammingLanguage(){
        System.out.println(CydeoStudent.programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID=" + ID +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */