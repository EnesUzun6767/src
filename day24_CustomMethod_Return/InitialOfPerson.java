package day24_CustomMethod_Return;

public class InitialOfPerson {
    public static void main(String[] args) {
IntialName();
String a="enesuzun2020@gmail.com";
String domain=domainEmail(a);
        System.out.println(domain);
    }

    public static void IntialName() {
        String name="Enes";
        System.out.println(name.charAt(0));
    }
    public  static String domainEmail(String email){
       String domain= email.substring(email.indexOf('@')+1,email.indexOf('.'));
       return domain;
    }
}
