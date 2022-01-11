package day13_String;

import java.util.Scanner;

/*
 Create a class calledTravel. Make a cost variable to calculate
 how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the nameOfDay of the people they will travel with in one line,
            		separating each nameOfDay with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName.
            		We have charged extra for the $numberOfBags bags
            		but you are traveling with $peopleYouTravelWith
            		so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years,
        			 but not to worry we will get it ready for you to travel to $allCountries.
        			 Your total cost has come out to $costAmount."


 */
public class Travel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you have valid passport?");
        String passport=scan.next();

        scan.nextLine();
        System.out.println("Where is your destination?");
        String country=scan.nextLine();
        System.out.println("How many bags do you take with you?");
        byte bag= scan.nextByte();;
        System.out.println("How many people travel with you?");
        short numPeople=scan.nextShort();
        int cost=1000*numPeople;
        int extra=50*bag;
        cost+=50*bag;
        if(numPeople>=3){
            cost-=300;
        }else{
            cost-=numPeople*100;
        }
        if(passport.equalsIgnoreCase("yes")){
            System.out.println("Your ticket is booked to "+country+" We have charged extra "+bag+" $"+
                    extra+" but you are travelling with "+numPeople+" so we are giving a discount Your total cost is $"+cost);
        }else{
            System.out.println("when your passport expired?");
            int numberOfYear= scan.nextInt();
            cost+=200;
            cost+=75*(2021-numberOfYear);
            scan.nextLine();
            System.out.println("Which country would you like to travel?");
            String country2= scan.nextLine();
            System.out.println("Are you going to travel next year?");
            String answer=scan.next();
            if(answer.equalsIgnoreCase("yes")) {


                cost = +100;
            }else {
                cost=-50;
            }
            System.out.println("Looks like your password has been expired for "+numberOfYear+" years, but no worry we will get it ready for you to travel to"+country2+ " your total cost has come to "+cost);
        }

    }
}
