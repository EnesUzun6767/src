package day31_CustomClass_Constructor;

public class MovieObject {
    public static void main(String[] args) {
        Movie movie1=new Movie("Turkey","See","Drama","12.12.2021","Enes");
        movie1.addCast("kulup");
        System.out.println(movie1);
    }
}
