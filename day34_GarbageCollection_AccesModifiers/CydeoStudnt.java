package day34_GarbageCollection_AccesModifiers;

public class CydeoStudnt {
public String name;
public char gender;
public int age;
public static int batchNumber;
public int groupNumber;
public static String schoolName,fieldOfStudy,ProgrammingLanguage,secretCode;

    public CydeoStudnt(String name, char gender, int age, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.groupNumber = groupNumber;
    }
    static {
        schoolName="Cydeo";
        fieldOfStudy="SDET";
        ProgrammingLanguage="Java";
        secretCode="WoodenSpoon";
        batchNumber=25;
    }
    public static void  printSchoolName(){
        System.out.println("school name is"+schoolName);
    }
    public static void printSecretcode(){
        System.out.println("secret code is:"+secretCode);
    }
    public void attendClass(){
        System.out.println(name+" has attend the class");
    }
    public void study(){
        System.out.println(name+"is stduying");
    }

    public String toString() {
        return "CydeoStudnt{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                '}';
    }

    public static void main(String[] args) {
        CydeoStudnt student1=new CydeoStudnt("Enes",'M',38,8);
        student1.study();
        student1.attendClass();
        printSchoolName();
        printSecretcode();
        System.out.println("Schoolame:"+CydeoStudnt.schoolName);
        System.out.println("Position: "+CydeoStudnt.fieldOfStudy);
        System.out.println("Main Language"+CydeoStudnt.ProgrammingLanguage);

    }
}
/*
 2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */