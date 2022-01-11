package day36_Inheritance.Phone;

public class Samsung extends Phone{

    public void faceTime(long number){
        System.out.println(number+" on faceTime call");
    }
    public void freezing(long number){
        System.out.println(number+" is freezing");
    }

    public static void main(String[] args) {
        Samsung samsung1=new Samsung();
        samsung1.setInfo("Samsung","A50","white","l",2100);
        System.out.println(samsung1);
   samsung1.freezing(1232);
    }
}
/*
1.3 Create a subclass of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */