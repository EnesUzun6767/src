package day15_For_Loop;

public class LoopTasks {
    public static void main(String[] args) {
        for(char i='A';i<='Z';i++){
            System.out.print(i+", ");
        }
        System.out.println();
        for(char i='a';i<='z';i++){
            System.out.print(i+", ");
        }
        for(char i='Z';i>='A';i--){
            System.out.print(i+", ");
        }
        System.out.println();
        for(char i='z';i>='a';i--){
            System.out.print(i+", ");
        }
    }
}
