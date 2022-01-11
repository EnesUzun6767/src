package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListContinue {
    public static void main(String[] args) {
        ArrayList<String>employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","Enes","Samet","Jimmy","Daniel","Shay"));
        System.out.println(employees);
        employees.retainAll(Arrays.asList("Enes","Samet"));
        System.out.println(employees);


        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        numbers.retainAll(Arrays.asList(4,5));
        System.out.println(numbers);

        ArrayList<Integer>num=new ArrayList<>();
        num.addAll(Arrays.asList(2,3,4,6,8,90,12));
        num.removeIf(integer -> !(integer%2==0));
        System.out.println(num);
        String result="";
    for(int each:num){
        result+=each+" ";
    }
        System.out.println(result);
    String[]array=result.split(" ");

        System.out.println(Arrays.toString(array));

        String[]names={"Marry","Mahmut","Tarkan","Money"};
        ArrayList<String>list=new ArrayList<>(Arrays.asList(names));
        list.removeIf(s -> s.startsWith("M"));
        System.out.println(list);//Arraylist
       names= list.toArray(new String[0]);// Array
        System.out.println(Arrays.toString(names));

        String[]jobs={"QA","Teacher","Engineers","QA","Technologist"};
        ArrayList<String>jobtitle=new ArrayList<>(Arrays.asList(jobs));
        System.out.println(jobtitle);
      int frequncy=  Collections.frequency(jobtitle,"QA");
        System.out.println(frequncy);
        Collections.reverse(jobtitle);
        System.out.println(jobtitle);
        Collections.swap(jobtitle,0,1);
        System.out.println(jobtitle);
        Collections.sort(jobtitle);
        System.out.println(jobtitle);
        ArrayList<String>job1=new ArrayList<>(jobtitle);
        job1.removeIf(s -> s.startsWith("Q"));
        System.out.println(job1);
        ArrayList<String>word=new ArrayList<>(jobtitle);
        word.retainAll(Arrays.asList("QA","Engineers"));
        System.out.println(word);
        ArrayList<String>works=new ArrayList<>(jobtitle);
        works.addAll(Arrays.asList("Civil","Developer","BA"));
        System.out.println(works);
        works.removeAll(Arrays.asList("Engineers"));
        System.out.println(works);
String[]work=new String[0];
work=works.toArray(new String[0]);
        System.out.println(Arrays.toString(work));





    }
}
