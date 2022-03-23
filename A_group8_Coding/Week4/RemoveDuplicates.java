package A_Group_8_Java_Coding.Week4;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="aaaaaexxxxnwwwwèsaaaaxxxr";
        System.out.println("result= " + removeDublicated(str));
    }
    public static String removeDublicated(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
          if(str.indexOf(i)==str.lastIndexOf(i))  {
              result+=str.charAt(i);
          }

        }
        return result;
    }
}
