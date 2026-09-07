package StriverDSAProblems.LearnBasics.JavaMaths;

import java.util.*;

public class PrintDivisors {

    public static void Divisors(int n) {
        System.out.print("[");
        for(int i= 1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+", ");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number= ");
        int num = sc.nextInt();
        Divisors(num);

    }
}
