package day20_Arrays;

public class Grades {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
        for (int i = 0; i < names.length; i++) {
            if(scores[i]>=90){
                System.out.println(grades[i]='A');
            }else if(scores[i]>=80){
                System.out.println(grades[i]='B');
            }else if(scores[i]>=70){
                System.out.println(grades[i]='C');
            }else if(scores[i]>=60){
                System.out.println(grades[i]='D');
            }else{
                System.out.println(grades[i]='F');
            }
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+"'s score is "+scores[i]+", and grade is "+grades[i]);

        }
    }
}
