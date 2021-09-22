package modelL2;

import java.util.Scanner;

public class TomJerryConv {
    /*.Generating Palindromes without iteration.
Tom thinks there exists only Palindrome numbers. So according to him, his first
number will be 11, then 22 and so on. But Jerry knows the normal number system,
which starts with 1, then 2 and so on. Now Jerry wants to tell some numbers to
Tom.
Your job is to help Jerry and Tom communicate. If Jerry says some number, you
have to translate to Tom's number system.
Note: You are not allowed to iterate all the numbers. Each palindrome number
should be generated.
Example:
Jerry : 2
To Tom : 22
Jerry : 11
To Tom : 111.*/
    static String result="";
    public static void word(int no){
        int rem = no/10;
        if(no/10==0) rem=no;
        translateJerry(no);
        System.out.println(rem+result);
    }
    public static void translateJerry(int no){
        if(no%10==0)   return;
        int sum = no/10;
        int rem = no%10;
        result+=String.valueOf(rem);
        translateJerry(sum);
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int no = scr.nextInt();
        word(no);
    }
}
