package day11Switch_Scanner;

public class BrowserName {
    public static void main(String[] args) {
    /*
    1. Create a class called Browser. Write a program that can display the nameOfDay of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser nameOfDay does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
     */
        String browser="chrome",result="";

        if(browser=="chrome"||browser=="firefox"||browser=="opera"||
        browser=="safari"||browser=="edge"){
            if(browser=="chrome"){
                result="Chrome is selected";
            }else if(browser=="firefox") {
                result = "firefox is selected";
            }else if(browser=="opera") {
                result = "Opera is selected";
            }else if(browser=="safari"){
                result="Safari is selected";
            }else {
                result="Edge is selected";
            }
        }
        else{
            System.out.println("Invalid operator");
            }
        System.out.println(result);
        }

    }
