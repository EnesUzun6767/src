package day33Statics;

public class PhoneIObject {
    public static void main(String[] args) {
        PhoneI phone1=new PhoneI("Iphone4",100,"blue",'X');
        phone1.faceTime(123);
        phone1.faceTime("enesuzun@gmail.com");
        System.out.println(phone1);
        System.out.println(PhoneI.brand);
        System.out.println(PhoneI.MadeIn);
    }
}
