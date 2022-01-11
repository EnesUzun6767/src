package day14_String;

public class SubstringEx_2 {
    public static void main(String[] args) {

        String email="enesuzun2020@gmail.com";
        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("domain is:"+domain);

        String number=email.substring(email.indexOf("2"),email.indexOf("@"));
        System.out.println("number part in email:"+number);
    }
}
