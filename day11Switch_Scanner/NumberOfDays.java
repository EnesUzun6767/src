package day11Switch_Scanner;
/*
28 days:2
30 days:4,6,9,11
31 days:1,3,5,7,8,10,12

 */
public class NumberOfDays {
    public static void main(String[] args) {
       int number=2;
       int year=2024;
       String result="";
       switch (number){
           case 2: //result=(year%4==0)?"29 days":28 days;
               if(year%4==0){
                   result="29 days";
               }else {
                   result = "28 days";
               }
               break;
           case 4: case 6: case 9: case 11:
               result="30 days";
               break;
           case 1: case 3: case 5: case 7: case 8: case 10: case 12:
               result="31 days";
               break;
           default:
               System.out.println("Invalid");
       }
        System.out.println(result);
    }
}
