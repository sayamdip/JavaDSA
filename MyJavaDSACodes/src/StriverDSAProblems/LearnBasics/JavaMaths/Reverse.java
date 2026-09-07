package StriverDSAProblems.LearnBasics.JavaMaths;

import java.util.*;

public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number= ");
        int n = sc.nextInt();
        int num=n;
        int reverse=0;
        while(n>0){
            reverse = reverse*10 + n%10;
            n=n/10;
        }
        System.out.print("Reverse Of "+num+" Is= "+reverse);
    }
}
