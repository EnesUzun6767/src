package day11Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {

        double n1=200.5,n2=10.5;
char ch='%';
boolean valid=ch=='+'||ch=='-'||ch=='*'||ch=='/';
if(valid){
    switch (ch){
        case '+':
            System.out.println(n1+n2);
            break;
        case '-':
            System.out.println(n1-n2);
            break;
        case '*':
            System.out.println(n1*n2);
            break;
        default:
            System.out.println(n1/n2);
    }
}else{
    System.err.println("Invalid operation");
}
    }
}
/* two numbers are given use switch statement to calculate the result of n1&n2 based
on given operators.
+,-,*,/

 */