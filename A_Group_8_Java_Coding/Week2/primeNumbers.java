package A_Group_8_Java_Coding.Week2;

public class primeNumbers {
    public static void main(String[] args) {
        System.out.println(primeNumbersCheck(31));
    }

    public static String primeNumbersCheck(int a) {
       String result="";
       if(a<2){
           throw new RuntimeException(a+ " can NOT BE less than 2 !!!");
       }
       if(a==2){
           System.out.println(a+ " is the only  even  prime number");
       }
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                result=a + " is NOT prime number";
                break;
            } else {
               result =a + " is a PRIME number";
            }
        }
        return result;
    }
}

