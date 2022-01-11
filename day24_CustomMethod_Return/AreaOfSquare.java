package day24_CustomMethod_Return;

public class AreaOfSquare {
    public static void main(String[] args) {
        int side=4;
        int area=AreaOfSquare(side);
        System.out.println(area);

    }
    public static int AreaOfSquare(int side){
        int area=side*side;
        return area;
    }
}
