package Day42_Exeptions;

public class DisadvantagesOfThrowKeyWord {
    public static void main(String[] args) {
        System.out.println("Hello");

       //   sleep(2.5); // throws

        System.out.println("Hello world");

        System.out.println("-------------------------");

        System.out.println("Hello");

        MorningWorkOut.sleep(2.5); // try & catch

        System.out.println("Cydeo");


    }


   public static void sleep(double seconds) throws InterruptedException {

       Thread.sleep( (long) (seconds * 1000) );

    }
    }
