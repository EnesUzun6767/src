package A_Group_8_Java_Coding.Week3;

public class Consecutive_Divisor {
    public static void main(String[] args) {
        threeDivisors(36);

    }
    public static void threeDivisors(int a){
        for (int i = 1; i < a+1; i++) {
            if(i%30==0){
                System.out.println("TestCoders");
            }else if(i%10==0){
                System.out.println("Codi1ityCoders");
            }else if(i%6==0){
                System.out.println("CodilityTest");
            }else if(i%5==0){
                System.out.println("Coders");
            }else if(i%3==0){
                System.out.println("Test");
            }else if(i%2==0){
                System.out.println("Codility");
            }else{
                System.out.println(i+"");
            }

        }

    }
}
/*
Numbers -- print consecutive numbers
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3
or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or
5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers
divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced
by CodilityTestCoders.
For example, here is the output for N = 24:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
Codi1ityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
 */