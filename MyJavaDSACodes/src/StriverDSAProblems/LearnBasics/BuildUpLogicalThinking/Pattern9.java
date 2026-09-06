package StriverDSAProblems.LearnBasics.BuildUpLogicalThinking;
import java.util.*;

public class Pattern9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        /*
             *
            ***
           *****
          *******
         *********
       */
        for(int i=0;i<=n/2;i++){
            for(int j=((n/2)-i);j>0;j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i;k++){
                System.out.print("*");
            } // This Two Nested For Loops Are Of


            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}