package day30CustomMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setInfo("Mazda","3","Blue",2020,6000);
        System.out.println(car1);
        car1.drive();
        car1.start();
        car1.stop();
        Car car2=new Car();
        car2.setInfo("Mercedes","CXL","white",2022,50_000);
        System.out.println(car2);
Car car3=new Car();
car3.setInfo("Audi","A5","Black",2021,30_000);
        System.out.println(car3);

     //   Car[]cars={car1,car2,car3};
        ArrayList<Car>carList=new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));
        System.out.println(carList);
        for (Car each :carList) {
            System.out.println(each.brand+" $"+each.price);
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
     carList.removeIf(s->s.brand.equals("BMW")&&s.year>=2005&&s.year<=2008);
     carList.removeIf(s-> s.equals("Toyota")&&s.year>=1995&&s.year<=1997);
        System.out.println(carList);

      /*
      BMW:2005-2008
      Toyata:1995-1997
       */





    }

}
