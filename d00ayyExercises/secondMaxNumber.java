package d00ayyExercises;

public class secondMaxNumber {
    public static void main(String[] args) {
        int[]arr={10, 45, 82, 40, 90, 2, 20};
        int max=secMax(arr);
        System.out.println(max);
    }
    public static int secMax(int[]arr){
        int max =Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
            for(int i=0;i<arr.length;i++){
                if(arr[i]==max){
                    arr[i]=max2;
                }
            }
                for (int j = 0; j < arr.length; j++) {
                    if(arr[j]> max2){
                        max2 =arr[j];
                }

            }
                return max2;
        }
    }

