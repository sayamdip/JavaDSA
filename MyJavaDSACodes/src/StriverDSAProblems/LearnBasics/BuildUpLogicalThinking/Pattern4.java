package StriverDSAProblems.LearnBasics.BuildUpLogicalThinking;
import java.util.*;

public class Pattern4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=1;
        // Pattern 1-
        /* 1
           22
           333
           4444
         */
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(count);

            }
            count++;
            System.out.println();
        }
    }

}