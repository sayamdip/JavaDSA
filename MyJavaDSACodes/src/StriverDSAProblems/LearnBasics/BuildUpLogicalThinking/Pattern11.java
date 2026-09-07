package StriverDSAProblems.LearnBasics.BuildUpLogicalThinking;

import java.util.*;

public class Pattern11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter A Number= ");
        int n = sc.nextInt();

        /*
           *
          ***
         *****
        *******
       *********
        *******
         *****
          ***
           *
        */

        // To Print The Upper Half
        for(int i=0; i<n/2+1; i++) {
            for (int j = n / 2 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // To Print The 2nd Half
        for(int z=0; z<n/2; z++){
            for(int m=0; m<=z; m++){
                System.out.print(" ");
            }
            for(int o= n/2-z; o>0;o--){
                System.out.print("*");
            }
            for(int p=(n/2-1)-z;p>0;p-- ){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
