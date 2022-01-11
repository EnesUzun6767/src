package day22_MultiDimensionalArray;

import java.util.Arrays;

public class Task3NameGroup {
    public static void main(String[] args) {
        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

    String[][]Batch25=new String[3][];
    Batch25[0]=batch25Group1;
    Batch25[1]=batch25Group2;
    Batch25[2]=batch25Group3;
        System.out.println(Arrays.deepToString(Batch25));

        System.out.println("=================================================");
        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};
Batch25[0]=batch24Group1;
Batch25[1]=batch24Group2;
Batch25[2]=batch24Group3;
        System.out.println(Arrays.deepToString(Batch25));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        String[][]CydeoStudents=new String[6][];
        CydeoStudents[0]=batch25Group1;
        CydeoStudents[1]=batch25Group2;
        CydeoStudents[2]=batch25Group3;
        CydeoStudents[3]=batch24Group1;
        CydeoStudents[4]=batch25Group2;
        CydeoStudents[5]=batch25Group3;
        System.out.println(Arrays.deepToString(CydeoStudents));
        System.out.println("=======================================================");
        for (String[] cydeoStudent : CydeoStudents) {
            for (String names : cydeoStudent) {
                System.out.print(names+" ");

            }

        }
    }
}
