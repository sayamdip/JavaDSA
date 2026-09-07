package StriverDSAProblems.LearnBasics.JavaMaths;

import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number= ");
        int n=sc.nextInt();
        int num=n;
        int reverse=0;
        while(num>0){
            reverse= reverse*10 + num%10;
            num=num/10;
        }
        if(reverse==n){
            System.out.print(n+" Is A Palindrome Number");
        }
        else{
            System.out.print(n+" Is Not A Palindrome Number");
        }

    }
}
