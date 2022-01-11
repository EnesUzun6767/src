package day00_Test;

import java.util.Arrays;
import java.util.Scanner;

public class task451lineOverLoading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String");
        String str1 = scan.next();
        System.out.println("Numbers: "+Arrays.toString(numbers(str1)));
        System.out.println("Letters:"+Arrays.toString(letters(str1)));
        System.out.println("Specials: "+Arrays.toString(special(str1)));
        System.out.println("sum of integers"+sum(str1));
        System.out.println("max even number: "+maxEven(str1));
        System.out.println("min odd number: "+minOdd(str1));
        System.out.println("avarage: "+avarage(str1));
        System.out.println("numbers frequency: "+numbersFreq(str1));
        System.out.println("letters frequency: "+letterFreq(str1));
        System.out.println("special char frequency: "+specialFreq(str1));


    }


public static int[] numbers(String str) {
        char[] s1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
        s1[i] = str.charAt(i);
        }
        int count1 = 0, count2 = 0, count3 = 0;
        for (Character each : s1) {
        if (Character.isDigit(each)) {
        count1++;
        } else if (Character.isLetter(each)) {
        count2++;
        } else if (!Character.isLetterOrDigit(each))  {
        count3++;
        }
        }


        int[] numbers = new int[count1];
        String[] letters = new String[count2];
        char[] special = new char[count3];


        int n=0,l=0,s=0;
        for (Character each : s1) {
        if (Character.isDigit(each)) {
        numbers[n++]=each-'0';
        } else if (Character.isLetter(each)) {
        letters[l++]=""+each;
        } else if (!Character.isLetterOrDigit(each))  {
        special[s++]=each;
        }
        }
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        double avarage=0;
        for (int number : numbers) {
        sum+=number;
        if((number%2==0)&&(number>max)){
        max=number;
        }if((number%2==1)&&(number<min)){
        min=number;
        }
        avarage=sum/numbers.length;

        }

        return numbers;

            }
    public static String[] letters(String str) {
        char[] s1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            s1[i] = str.charAt(i);
        }
        int count1 = 0, count2 = 0, count3 = 0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                count1++;
            } else if (Character.isLetter(each)) {
                count2++;
            } else if (!Character.isLetterOrDigit(each))  {
                count3++;
            }
        }
        int[] numbers = new int[count1];
        String[] letters = new String[count2];
        char[] special = new char[count3];
        int n=0,l=0,s=0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                numbers[n++]=each-'0';
            } else if (Character.isLetter(each)) {
                letters[l++]=""+each;
            } else if (!Character.isLetterOrDigit(each))  {
                special[s++]=each;
            }
        }
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        double avarage=0;
        for (int number : numbers) {
            sum+=number;
            if((number%2==0)&&(number>max)){
                max=number;
            }if((number%2==1)&&(number<min)){
                min=number;
            }
            avarage=sum/numbers.length;

        }

        return letters;

    }
    public static char[] special(String str) {
        char[] s1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            s1[i] = str.charAt(i);
        }
        int count1 = 0, count2 = 0, count3 = 0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                count1++;
            } else if (Character.isLetter(each)) {
                count2++;
            } else if (!Character.isLetterOrDigit(each))  {
                count3++;
            }
        }
        int[] numbers = new int[count1];
        String[] letters = new String[count2];
        char[] special = new char[count3];
        int n=0,l=0,s=0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                numbers[n++]=each-'0';
            } else if (Character.isLetter(each)) {
                letters[l++]=""+each;
            } else if (!Character.isLetterOrDigit(each))  {
                special[s++]=each;
            }
        }
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        double avarage=0;
        for (int number : numbers) {
            sum+=number;
            if((number%2==0)&&(number>max)){
                max=number;
            }if((number%2==1)&&(number<min)){
                min=number;
            }
            avarage=sum/numbers.length;

        }

        return special;

    }
    public static int sum(String str) {
        char[] s1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            s1[i] = str.charAt(i);
        }
        int count1 = 0, count2 = 0, count3 = 0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                count1++;
            } else if (Character.isLetter(each)) {
                count2++;
            } else if (!Character.isLetterOrDigit(each))  {
                count3++;
            }
        }
        int[] numbers = new int[count1];
        String[] letters = new String[count2];
        char[] special = new char[count3];
        int n=0,l=0,s=0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                numbers[n++]=each-'0';
            } else if (Character.isLetter(each)) {
                letters[l++]=""+each;
            } else if (!Character.isLetterOrDigit(each))  {
                special[s++]=each;
            }
        }
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        double avarage=0;
        for (int number : numbers) {
            sum+=number;
            if((number%2==0)&&(number>max)){
                max=number;
            }if((number%2==1)&&(number<min)){
                min=number;
            }
            avarage=sum/numbers.length;

        }

        return sum;

    }
    public static int maxEven(String str) {
        char[] s1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            s1[i] = str.charAt(i);
        }
        int count1 = 0, count2 = 0, count3 = 0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                count1++;
            } else if (Character.isLetter(each)) {
                count2++;
            } else if (!Character.isLetterOrDigit(each))  {
                count3++;
            }
        }
        int[] numbers = new int[count1];
        String[] letters = new String[count2];
        char[] special = new char[count3];
        int n=0,l=0,s=0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                numbers[n++]=each-'0';
            } else if (Character.isLetter(each)) {
                letters[l++]=""+each;
            } else if (!Character.isLetterOrDigit(each))  {
                special[s++]=each;
            }
        }
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        double avarage=0;
        for (int number : numbers) {
            sum+=number;
            if((number%2==0)&&(number>max)){
                max=number;
            }if((number%2==1)&&(number<min)){
                min=number;
            }
            avarage=sum/numbers.length;

        }

        return max;

    }
    public static int minOdd(String str) {
        char[] s1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            s1[i] = str.charAt(i);
        }
        int count1 = 0, count2 = 0, count3 = 0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                count1++;
            } else if (Character.isLetter(each)) {
                count2++;
            } else if (!Character.isLetterOrDigit(each))  {
                count3++;
            }
        }
        int[] numbers = new int[count1];
        String[] letters = new String[count2];
        char[] special = new char[count3];
        int n=0,l=0,s=0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                numbers[n++]=each-'0';
            } else if (Character.isLetter(each)) {
                letters[l++]=""+each;
            } else if (!Character.isLetterOrDigit(each))  {
                special[s++]=each;
            }
        }
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        double avarage=0;
        for (int number : numbers) {
            sum+=number;
            if((number%2==0)&&(number>max)){
                max=number;
            }if((number%2==1)&&(number<min)){
                min=number;
            }
            avarage=sum/numbers.length;

        }

        return min;

    }
    public static double avarage(String str) {
        char[] s1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            s1[i] = str.charAt(i);
        }
        int count1 = 0, count2 = 0, count3 = 0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                count1++;
            } else if (Character.isLetter(each)) {
                count2++;
            } else if (!Character.isLetterOrDigit(each))  {
                count3++;
            }
        }
        int[] numbers = new int[count1];
        String[] letters = new String[count2];
        char[] special = new char[count3];
        int n=0,l=0,s=0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                numbers[n++]=each-'0';
            } else if (Character.isLetter(each)) {
                letters[l++]=""+each;
            } else if (!Character.isLetterOrDigit(each))  {
                special[s++]=each;
            }
        }
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        double avarage=0;
        for (int number : numbers) {
            sum+=number;
            if((number%2==0)&&(number>max)){
                max=number;
            }if((number%2==1)&&(number<min)){
                min=number;
            }
            avarage=sum/numbers.length;

        }

        return avarage;

    }
    public static int numbersFreq(String str) {
        char[] s1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            s1[i] = str.charAt(i);
        }
        int count1 = 0, count2 = 0, count3 = 0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                count1++;
            } else if (Character.isLetter(each)) {
                count2++;
            } else if (!Character.isLetterOrDigit(each))  {
                count3++;
            }
        }
        int[] numbers = new int[count1];
        String[] letters = new String[count2];
        char[] special = new char[count3];
        int n=0,l=0,s=0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                numbers[n++]=each-'0';
            } else if (Character.isLetter(each)) {
                letters[l++]=""+each;
            } else if (!Character.isLetterOrDigit(each))  {
                special[s++]=each;
            }
        }
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        double avarage=0;
        for (int number : numbers) {
            sum+=number;
            if((number%2==0)&&(number>max)){
                max=number;
            }if((number%2==1)&&(number<min)){
                min=number;
            }
            avarage=sum/numbers.length;

        }

        return count1;

    }
    public static int letterFreq(String str) {
        char[] s1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            s1[i] = str.charAt(i);
        }
        int count1 = 0, count2 = 0, count3 = 0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                count1++;
            } else if (Character.isLetter(each)) {
                count2++;
            } else if (!Character.isLetterOrDigit(each))  {
                count3++;
            }
        }
        int[] numbers = new int[count1];
        String[] letters = new String[count2];
        char[] special = new char[count3];
        int n=0,l=0,s=0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                numbers[n++]=each-'0';
            } else if (Character.isLetter(each)) {
                letters[l++]=""+each;
            } else if (!Character.isLetterOrDigit(each))  {
                special[s++]=each;
            }
        }
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        double avarage=0;
        for (int number : numbers) {
            sum+=number;
            if((number%2==0)&&(number>max)){
                max=number;
            }if((number%2==1)&&(number<min)){
                min=number;
            }
            avarage=sum/numbers.length;

        }

        return count2;

    }
    public static int specialFreq(String str) {
        char[] s1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            s1[i] = str.charAt(i);
        }
        int count1 = 0, count2 = 0, count3 = 0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                count1++;
            } else if (Character.isLetter(each)) {
                count2++;
            } else if (!Character.isLetterOrDigit(each))  {
                count3++;
            }
        }
        int[] numbers = new int[count1];
        String[] letters = new String[count2];
        char[] special = new char[count3];
        int n=0,l=0,s=0;
        for (Character each : s1) {
            if (Character.isDigit(each)) {
                numbers[n++]=each-'0';
            } else if (Character.isLetter(each)) {
                letters[l++]=""+each;
            } else if (!Character.isLetterOrDigit(each))  {
                special[s++]=each;
            }
        }
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        double avarage=0;
        for (int number : numbers) {
            sum+=number;
            if((number%2==0)&&(number>max)){
                max=number;
            }if((number%2==1)&&(number<min)){
                min=number;
            }
            avarage=sum/numbers.length;

        }

        return count3;

    }

        }



