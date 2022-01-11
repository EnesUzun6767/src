package day26CustomMethodPractise;

public class ReplaceAll {
        public static int[] replaceAll(int[] arr, int oldElement, int newElement){
            int[] newArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
                if (newArr[i] == oldElement){
                    newArr[i] = newElement;
                }
            }
            return newArr;
        }



        public static double[] replaceAll(double[] arr, double oldElement, double newElement){
            double[] newArr = new double[arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
                if (newArr[i] == oldElement){
                    newArr[i] = newElement;
                }
            }
            return newArr;
        }


        public static char[] replaceAll(char[] arr, char oldElement, char newElement){
            char[] newArr = new char[arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
                if (newArr[i] == oldElement){
                    newArr[i] = newElement;
                }
            }
            return newArr;
        }

        public static String[] replaceAll(String[] arr, String oldElement, String newElement){
            String[] newArr = new String[arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
                if (newArr[i].equals(oldElement)){
                    newArr[i] = newElement;
                }
            }
            return newArr;
        }
}
