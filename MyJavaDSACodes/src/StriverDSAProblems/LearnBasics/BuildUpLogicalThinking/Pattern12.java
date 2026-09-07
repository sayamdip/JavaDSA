package StriverDSAProblems.LearnBasics.BuildUpLogicalThinking;

import java.util.*;
public class Pattern12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        /*
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
        */

        // For 1st Part
        for(int i=0;i<n;i++) {
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // For 2nd Part
        for(int k=1; k<n; k++){
            for(int l=n-k; l>0; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
