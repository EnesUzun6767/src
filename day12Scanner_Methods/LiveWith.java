package day12Scanner_Methods;

import java.util.Scanner;

/*  Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */
public class LiveWith {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("How many people do you live with?");
        int numberOfPeople= scan.nextInt();

        System.out.println("number of people = " + numberOfPeople);

        String result=(numberOfPeople<=3)?"Live with less than 3 people":(numberOfPeople>3&&numberOfPeople<=6)?
                "Live with 3-6 people":"Live with more than 6 people";
        System.out.println(result);

        scan.close();
    }
}
