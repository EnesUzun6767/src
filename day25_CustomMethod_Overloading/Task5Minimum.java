package day25_CustomMethod_Overloading;

public class Task5Minimum {
    public static void main(String[] args) {

    }

    public static int minimumNumber(int[] numbers) {
        int min = numbers[0];
        for (int each : numbers) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static byte minimumNumber(byte[] numbers) {
        byte min = numbers[0];
        for (byte each : numbers) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static long minimumNumber(long[] numbers) {
        long min = numbers[0];
        for (long each : numbers) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static double minimumNumber(double[] numbers) {
        double min = numbers[0];
        for (double each : numbers) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static float minimumNumber(float[] numbers) {
        float min = numbers[0];
        for (float each : numbers) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
}