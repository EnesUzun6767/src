package day27_WrapperClasses;

import java.util.Scanner;

public class DinnerTask3_Retrive_Digit_Letters_Specials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str= scan.next();
        String result1="";
        String result2="";
        String result3="";
      char[]ch= str.toCharArray();
      for (char each:ch){
          if(Character.isLetter(each)){
              result1+=""+each;
          }else if(Character.isDigit(each)){
              result2+=""+each;
          }else{
              result3+=""+each;
          }
      }
        System.out.println("letters: "+result1+"\n"+"digits "+result2+"\n"+"special character: "+result3);

    }

}

/*3. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
        str = "Wooden Spoon!"

        output:
        letters= "WoodenSpoon";
        Digits = "";
        specialChars = " !";*/
