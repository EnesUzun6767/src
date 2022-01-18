package day39Recap.Task2;

public class States {
private String name;
private String abbreviation;
private String politicalParty;
private String Governor;
private String senator;
private int population;
private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
       setName(name);
        setAbbreviation(abbreviation);
        setAbbreviation(politicalParty);
       setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()||name.isEmpty()) {
            System.out.println("Invalid name");
            System.exit(1);
        }

        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation.isBlank()||abbreviation.isEmpty()){
            System.out.println("Invalid entry");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty.isBlank()||politicalParty.isEmpty()){
            System.out.println("Invalid Entry");
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if(governor.isBlank()||governor.isEmpty()){
            System.out.println("invalid entry");
        }
        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(senator.isBlank()||senator.isEmpty()){
            System.out.println("Invalid entry");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getStateTax() {

        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax<=0){
            System.out.println("Invalid entry");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }
    public void payTax(){}

    @Override
    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
/*
States Task:
	1. Create a class named States:
			variables:
				name, abbreviation, politicalParty, Governor, senator, population, stateTax

			Encapsulate all the fields

			Add a constructor that can set all the fields

						Conditions:
							1. name, abbreviation, politicalParty, Governor, and senator can not be null
							2. name, abbreviation, politicalParty, Governor, and senator can not be empty
							3. taxRate can not be negative
							4. Population can not be set to zero or negative

			Methods:
				toString()


	2. Create the following subclasses of States and add any additional fields and methods if necessary:
				1. Virginia
				2. California
				3. Texas
				4. Florida


	3. Create a class named StateObjects
					Create the objects of each subclasses

					test all the functions of each objects

            		Analyze the relationships between the classes


Student Task:
	1. Create a class named Person:
			Variables:
				name, age, gender

			Encapsulate all the fields

			Add a constructor that can set all the fields

					Condition:
						1. name should not be set to null
						2. name should not be empty
						3. name should not contain any special character other than space
						4. age should not be set to negative
						5. gender must be valid

			Methods:
				eat()
				drink()
				sleep()
				toString()


	2. Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName

				Encapsulate all the fields

				Add a constructor that can set all the fields

							Condition:
									1. filedOfStudy and schoolName should not be set to null
									2. filedOfStudy and schoolName should not be empty
									3. grade must be valid (A, B, C, D, F)


				Extra methods:
					study()
					toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included



	3. Create the following sub classes of Student class:

				1. GraduateStudent:

						Override the study method

						add any additional fields and methods if necessary

				2. UndergraduateStudent

						Override the study method

						add any additional fields and methods if necessary

				3. CydeoStudent:

						Extra Variables:
							batchNumber, groupNumber, programmingLanguage

						Encapsulate all the fields

						Add a constructor that can set all the fields

 */