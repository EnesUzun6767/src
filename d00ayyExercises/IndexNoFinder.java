package d00ayyExercises;

public class IndexNoFinder {
    public static void main(String[] args) {
        int[] a = {10, 45, 82, 40, 90,90, 2, 20};
        int index=indexFinder(a,20);
        System.out.println(index);
    }
    public static int indexFinder(int[]array ,int num){
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==num){
                index=i;
            }
        }
        return index;
    }
}
