package StriverDSAProblems.LearnBasics.BuildUpLogicalThinking;
import java.util.*;

public class Pattern10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        /*
         *********
          *******
           *****
            ***
             *
        */

        for(int i=0; i<(n/2)+1; i++){

            for(int k=1; k<=i; k++){
                System.out.print(" ");
            }
            for(int j=(n/2 + 1)-i; j>0; j--){
                System.out.print("*");
            }
            for(int l=(n/2-i); l>0; l--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}