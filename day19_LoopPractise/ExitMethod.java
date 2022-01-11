package day19_LoopPractise;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            if(i==3){
               // break;// terminates the loop at i=3   1,2, WoodenSpoon
                //continue;//terminates the current iteration of the loop skip 3
                System.exit(0);//terminates the whole program until 3
                 }
            System.out.println(i);
    }
        System.out.println("WoodenSpoon");
}
}