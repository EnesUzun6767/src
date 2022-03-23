package Day42_Exeptions;

import day31_CustomClass_Constructor.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyWord2 {
    public static void main(String[] args) {
        throw new NoSuchElementException("No such Element");//manually created
       //throw new Rectangle(5,7);//we can not do this  which has already created
        //throw new InterruptedException();
       //throw new NoSuchElementException();
    }
}
