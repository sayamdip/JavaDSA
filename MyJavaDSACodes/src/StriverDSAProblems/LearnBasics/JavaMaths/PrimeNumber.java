package StriverDSAProblems.LearnBasics.JavaMaths;

import java.util.*;

public class PrimeNumber {
    public static void Prime(int n){
        int count =0;
        for(int i=1; i<=n; i++){

            if(n%i==0){
                count ++;
            }
        }
        if(count==2){
            System.out.print(n+" Is A Prime Number");
        }
        else{
            System.out.print(n+" Is A Composite Number");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number= ");
        int num = sc.nextInt();
        Prime(num);

    }
}
