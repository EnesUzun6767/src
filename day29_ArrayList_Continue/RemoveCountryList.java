package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountryList {
    public static void main(String[] args) {


        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};
        ArrayList<String> country = new ArrayList<>(Arrays.asList(countries));
        country.removeIf(s -> s.length()>=10);
        System.out.println(country);//Array list
          countries=country.toArray(new String[0]);// any  number can be written here
        System.out.println(Arrays.toString(countries));//Array
        }
    }

