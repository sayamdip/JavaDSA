package StriverDSAProblems.LearnBasics.BuildUpLogicalThinking;
import java.util.*;

public class Pattern3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Pattern 1-
        /* 1
           12
           123
           1234
         */
        for(int i=0; i<n; i++){
            int count=1;
            for(int j=0; j<=i; j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

}
