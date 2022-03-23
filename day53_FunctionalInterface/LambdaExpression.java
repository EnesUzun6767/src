package day53_FunctionalInterface;

import Utility.StringUtility;

public class LambdaExpression {
    public static void main(String[] args) {
        MyThirdFunctionalInterface<String >stringReverse=
                (s)->{
                    String reverse= StringUtility.reverse(s);
                    return reverse;
                };
        String reverse=stringReverse.method("WoodenSpoon");
        System.out.println("reverse = " + reverse);
    }


    }

