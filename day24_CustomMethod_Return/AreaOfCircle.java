package day24_CustomMethod_Return;

public class AreaOfCircle {
    public static void main(String[] args) {
        double radius=5;
        double area=AreaOfCircle(radius);
        System.out.println(area);
        System.out.println( perimeterOfCircle(radius));
    }
    public static double AreaOfCircle(double radius){

        double area=3.14*radius*radius;
        return area;
    }
    public static double perimeterOfCircle(double radius){
        double perimeter=3.14*2*radius;
        return perimeter;
    }

}
