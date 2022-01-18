package day27_WrapperClasses;

public class WrappedMethods {
    public static void main(String[] args) {
        String str="123";
       int num= Integer.parseInt(str);//int
        System.out.println(num+1);//124
        System.out.println(str+1);//1231
        String str2="10.5";
        double num2=Double.parseDouble(str2);//
        System.out.println(num2+1);
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        long max1=Long.MAX_VALUE;
        long min1=Long.MIN_VALUE;
        System.out.println("min1 = " + min1);
        System.out.println("max1 = " + max1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        String s1="true";
       boolean r1= Boolean.parseBoolean(s1);
        System.out.println(r1);
        String s2="false";
        boolean r2=Boolean.parseBoolean(s2);
        System.out.println(r2);
        String s3="maybe";
        boolean r3=Boolean.parseBoolean(s3);
        System.out.println(r3);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        String a1="123";
        Integer x=Integer.valueOf(a1);//
        int y=Integer.valueOf(a1);

        System.out.println(x);
        System.out.println(y);

        String a2="1.3";
        double z=Double.valueOf(a2);
        Double z1=Double.valueOf(a2);
        String s = "125";
        int a=Integer.parseInt(s);
        Integer b=Integer.valueOf(s);
        boolean w=a==b;
        System.out.println("w is: a==b: "+w);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
//isDigit();
        char ch1='0';
        boolean r21=Character.isDigit(ch1);
        System.out.println(r21);

        char ch2='w';

        boolean s11=Character.isLetter(ch2);
        System.out.println(s11);
        char ch3='!';
        boolean q12=!Character.isLetterOrDigit(ch3);
        System.out.println(q12);
        // upperCase
        boolean r5 = Character.isUpperCase(ch1);

        //lowerCase
        boolean r6 = Character.isLowerCase(ch1);

String ss="ab1cde2efg3hi4";
int sum=0;
        for (char each:ss.toCharArray()) {
            if (Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }

        }
        System.out.println("sum is: "+sum);



    }
}
