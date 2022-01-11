package day25_CustomMethod_Overloading;

public class Task4MaskNumber {
    public static void main(String[] args) {
        
    }
    public static int maxNumber(int[] numbers ){
        int max=numbers[0];
        for (int each:numbers) {
            if(each>max){
                max=each;
            }

        }
        return max;
    }
    public static double maxNumber(double[] numbers ){
        double max=numbers[0];
        for (double each:numbers) {
            if(each>max){
                max=each;
            }

        }
        return max;
    }
    public static long maxNumber(long[] numbers ){
        long max=numbers[0];
        for (long each:numbers) {
            if(each>max){
                max=each;
            }

        }
        return max;
    }
    public static short maxNumber(short[] numbers ){
        short max=numbers[0];
        for (short each:numbers) {
            if(each>max){
                max=each;
            }

        }
        return max;
    }
    public static float maxNumber(float[] numbers ){
        float max=numbers[0];
        for (float each:numbers) {
            if(each>max){
                max=each;
            }

        }
        return max;
    }
    public static byte maxNumber(byte[] numbers ){
        byte max=numbers[0];
        for (byte each:numbers) {
            if(each>max){
                max=each;
            }

        }
        return max;
    }
}
