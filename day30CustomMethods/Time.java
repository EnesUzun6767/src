package day30CustomMethods;

public class Time {
    public int hour;
    public int minute;
    public int second;
    public int millisecond;

    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                ", millisecond=" + millisecond +
                '}';
    }

    public void setInfo(int hour, int minute, int second, int millisecond) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.millisecond = millisecond;

    }
}
