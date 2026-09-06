package StriverDSAProblems.LearnBasics.BuildUpLogicalThinking;
import java.util.*;

public class Pattern8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        /*
         *****
          ****
           ***
            **
             *

         */

        for (int i=0; i<n; i++) {

            for (int j = 0; j <= (i-1); j++) {
                System.out.print(" ");
            }

            for (int k = n-i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}