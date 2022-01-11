package day30CustomMethods;

public class TimeObject {
    public static void main(String[] args) {
        Time time1=new Time();
        Time time2=new Time();
        time1.setInfo(11,42,53,789);
        time2.setInfo(9,46,52,987);
       Time sum=new Time();
       sum=sumOfTime(time1,time2);
        System.out.println(sum);

    }
    public static Time sumOfTime(Time time1,Time time2){
        Time time3=new Time();
       time3.hour= (time1.hour*60*60*1000+time2.hour*60*60*1000+time1.minute*60*1000+time2.minute*60*1000+
                time1.second*1000+ time2.second*1000+time1.millisecond+time2.millisecond)/(60*60*1000);
       time3.minute=((time1.hour*60*60*1000+time2.hour*60*60*1000+time1.minute*60*1000+time2.minute*60*1000+
               time1.second*1000+ time2.second*1000+time1.millisecond+time2.millisecond)%(60*60*1000))/(60*1000);
       time3.second=(((time1.hour*60*60*1000+time2.hour*60*60*1000+time1.minute*60*1000+time2.minute*60*1000+
               time1.second*1000+ time2.second*1000+time1.millisecond+time2.millisecond)%(60*60*1000))%(60*1000))/1000;
       time3.millisecond=((((time1.hour*60*60*1000+time2.hour*60*60*1000+time1.minute*60*1000+time2.minute*60*1000+
               time1.second*1000+ time2.second*1000+time1.millisecond+time2.millisecond)%(60*60*1000))%(60*1000))%1000);
        return time3;
        }
    }

