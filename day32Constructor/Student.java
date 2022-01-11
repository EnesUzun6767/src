package day32Constructor;

public class Student {
    public String name;
    public char gender;
    public int ID;
    public int age;
    public char grade;

    public Student(String name, char gender, int ID, int age, char grade) {
        this.name = name;
        this.gender = gender;
        this.ID = ID;
        this.age = age;
        this.grade = grade;
    }
    public String result(){
       String a="";
        if(grade=='F'){
           a="failed";
        }else{
          a="Passed";
        }
        return a;
    }

    public String toString() {
        return
                "result="+result();

    }
}
