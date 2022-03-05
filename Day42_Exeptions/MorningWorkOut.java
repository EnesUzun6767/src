package Day42_Exeptions;

public class MorningWorkOut {
    public static void main(String[] args) {
        System.out.println("----------push up started----------");
        for (int i = 1; i < 31; i++) {

            System.out.print("\rPush up "+i);
            sleep(0.4);
        }
        System.out.println();
        System.out.println("-----------Push up done-------------");

        System.out.println("----------pull up started----------");
        for (int i = 1; i < 31; i++) {

            System.out.print("\rpull up "+i);
            sleep(0.5);
        }


        System.out.println();
        System.out.println("---------pull ups is done -------------");
    }

public static void sleep(double seconds){
    try {
        Thread.sleep((long) (1000*seconds));
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}
