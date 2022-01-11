package day28_ArrayList;

public class StrongPasswordTwo {
    public static void main(String[] args) {

        String password = "WoodenSpoon123!";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each)){
                countUpperCase++;
            }else if(Character.isLowerCase(each)){
                countLowerCase++;
            }else if(Character.isDigit(each)){
                countDigits++;
            }else{
                countSpecialChar++;
            }
        }

/*
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countSpecialChar = " + countSpecialChar);
        System.out.println("countDigits = " + countDigits);
*/

        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowercase = countLowerCase > 0;
        boolean hasDigit = countDigits > 0;
        boolean hasSpecialChar = countSpecialChar > 0;

        boolean strongPassword = password.length() >= 8 && !password.contains(" ") && hasSpecialChar && hasLowercase && hasUpperCase && hasDigit;

        System.out.println("strongPassword = " + strongPassword);

    }
}
