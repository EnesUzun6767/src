package day24_CustomMethod_Return;

public class ReturnMethodPractise3 {
    public static void main(String[] args) {
        String str = "aabccdee";
        for (int i = 0; i < str.length(); i++) {
            int counter = frequenccy(str, str.charAt(i));

            if (counter==1){
                System.out.println(str.charAt(i));
            }
        }
    }
    public static int frequenccy(String str,char ch){
        int count=0;
        for (char each:str.toCharArray()){
            if (each==ch){
                count++;
            }
        }
        return count;
    }
}
