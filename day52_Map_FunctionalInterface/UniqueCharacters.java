package day52_Map_FunctionalInterface;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabcccdeeeaefa";

       ArrayList<String> arr=new ArrayList<>(Arrays.asList(str.split("")));

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency(arr, each);
            if (frequency == 1) {
                result.put(each, frequency);
            }
        }


        System.out.println(result);

        str = "eeeeeaaabbbbccccdd";
        //1.convert String to ArrayList.
        ArrayList<String> list= new ArrayList<>(Arrays.asList(str.split("")));

        //2. create Map.
        Map<String, Integer> map = new LinkedHashMap<>();
        int highestFrequency = Integer.MIN_VALUE;
        //3. Iterate array.
        for (String eachElement : list) {  // each represents each Element in Array
            int frequency = Collections.frequency(list, eachElement);
            map.put(eachElement, frequency);
            if(frequency>highestFrequency){  //highest frequency;
                highestFrequency=frequency;
            }
        }
        String  character="";
        for (Map.Entry<String, Integer> pairs : map.entrySet()) {
            if(pairs.getValue()==highestFrequency){
                character=pairs.getKey();
            }
        }
        System.out.println(map);
        System.out.println("Character " + character+ " has the maximum frequency.");

        
        ArrayList<String>courses=new ArrayList<>(Arrays.asList("java", "java"," python", "c#"));
        int max=Integer.MIN_VALUE;
        Map<String,Integer>mapCourse=new LinkedHashMap<>();
        for (String each : courses) {
            int count =Collections.frequency(courses,each);
            mapCourse.put(each, count);
            if(count >max){
                max= count;
            }
            }
        System.out.println("mapCourse = " + mapCourse);
        System.out.println("max = " + max);
        String mostLovedCourse="";
        for (Map.Entry<String, Integer> pairs : mapCourse.entrySet()) {
            if(pairs.getValue()== max){
                mostLovedCourse= pairs.getKey();
            }
        }
        System.out.println("mostLovedCourse = " + mostLovedCourse);
    }



    }


/*
Assignments:
	Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

        Ex:
            str = "eeeeeaaabbbbccccdd"

        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character e has the highest frequency


	Write a program that can find the element that has the highest frequency in an arrayList
	        Note: Must use a map

	        Ex:
	            list: [java, java, python, c#]

	        output:
	            [java=2, python=1, c#=1]
	            element java has the highest frequency


 */
