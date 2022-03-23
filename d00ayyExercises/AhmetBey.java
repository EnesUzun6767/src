package d00ayyExercises;

public class AhmetBey {  public static void main(String[] args) {
    int[] a = {10, 45, 82, 40, 90,90, 2, 20};
    int n = 4;

    System.out.println(n + " th max number is " + findMax(a, n));
}


    public static int findMax(int[] arr, int num) {
        if (num > arr.length - 1 || num < 0) {
            System.err.println("invalid request " + num);
            System.exit(0);
        }

        int indexMax = 0;
        for (int k = 0; k < num; k++) {

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {      //  10,45,82,40,90,2,20
                if (arr[i] > max) {
                    max = arr[i];

                }

            }
            for (int m = 0; m < arr.length; m++) {
                if (arr[m] == max)
                    arr[m] = Integer.MIN_VALUE;
            }

            indexMax=max;
        }
        return indexMax;
    }


}

