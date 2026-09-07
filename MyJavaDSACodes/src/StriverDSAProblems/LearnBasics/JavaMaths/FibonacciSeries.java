package StriverDSAProblems.LearnBasics.JavaMaths;

import java.util.*;
public class FibonacciSeries {
    public static void Fibonacci(int num){
        int a=0;
        int b=1;
        int c=0;
        int i=0;

        System.out.print(a+", ");
        while(i<num){
            a=b;
            b=c;
            c=a+b;
            System.out.print(c+", ");
            i++;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number= ");
        int n = sc.nextInt();

        Fibonacci(n);
    }
}
