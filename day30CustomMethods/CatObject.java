package day30CustomMethods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CatObject {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        Cat cat2=new Cat();
        Cat cat3=new Cat();
        Cat cat4=new Cat();
        Cat cat5=new Cat();
        cat1.setInfo("Lucky",3,"Siyam",'M',"White","small");
        cat2.setInfo("Rucky",2,"Van",'F',"Black","large");
        cat3.setInfo("Rocky",1,"Street",'M',"Yellow","small");
        cat4.setInfo("Benek",4,"BackStreet",'M',"White","large");
        cat5.setInfo("Nany",3,"Siyam",'F',"White","large");
      Cat[]cats={cat1,cat2,cat3,cat4,cat5};
        ArrayList<Cat>cats1=new ArrayList<>();
        cats1.addAll(Arrays.asList(cats));
        System.out.println(Arrays.toString(cats));
        System.out.println(cats1);
        int count=0;
        for (Cat each : cats) {
            if (each.age <= 2) {
                count++;
            }
        }
            Cat[]teNcats=new Cat[count];
             int i=0;
        for (Cat each : cats) {
            if(each.age<=2){
                teNcats[i]=each;
                i++;
            }
        }
        System.out.println(Arrays.toString(teNcats));

    }
}
