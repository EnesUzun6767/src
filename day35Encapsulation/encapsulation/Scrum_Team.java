package day35Encapsulation.encapsulation;

public class Scrum_Team {
    private String name;
    private int employeeID;
    private String jobTitle;
    private double salary;


    public Scrum_Team(String name, int employeeID, String jobTitle, double salary) {
        setName(name);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if (employeeID<=0){
            System.err.println("Employee ID can not be zero or negative");
            return;
        }
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0){
            System.err.println("Salary can not be zero or negative");
            return;
        }
        this.salary = salary;
    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public void unitTesting(){
        System.out.println(name + " is unit testing");
    }

    public void fixingBugs(){
        System.out.println(name + " is fixing bugs");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}


//=====================================================================

class Tester{
    private String name;
    private int employeeID;
    private String jobTitle;
    private double salary;

    public int getEmployeeID() {
        return employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
