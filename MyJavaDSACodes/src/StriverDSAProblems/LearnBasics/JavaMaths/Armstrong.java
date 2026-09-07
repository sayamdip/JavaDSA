package StriverDSAProblems.LearnBasics.JavaMaths;

import java.util.*;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number= ");
        int n = sc.nextInt();
        int number=n;
        int num=0;

        while(n>0){
            int digit = (n%10);
            num = num + (digit * digit * digit);
            n=n/10;
        }
        if(num==number){
            System.out.print(number+" Is A Palindrome Number");
        }
        else {
            System.out.print(number + " Is Not A Palindrome Number");
        }
    }
}
