package day11Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browser1="Chrome",browser2="Firefox",browser3="Opera",browser4="Safari",browser5="Edge",selected="Safari";

        switch (selected){
            case "Chrome":
                System.out.println(browser1+" is selected");
            break;
                case "Firefox":
                    System.out.println(browser2+" is selected");
                    break;
            case "Opera":
                System.out.println(browser3+" is selected");
                break;
            case "Safari":
                System.out.println(browser4+" is selected");
                break;
            case "Edge":
                System.out.println(browser5+" is selected");
                break;
            default:
                System.out.println("Invalid Browser");
        }
    }
}
