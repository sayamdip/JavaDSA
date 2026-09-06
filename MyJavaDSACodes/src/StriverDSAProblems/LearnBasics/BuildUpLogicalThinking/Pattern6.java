package StriverDSAProblems.LearnBasics.BuildUpLogicalThinking;
import java.util.*;

public class Pattern6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        /*
         12345
         1234
         123
         12
         1
         */
        for(int i=n; i>0; i--){
            int count=1;
            for(int j=i; j>0; j--){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }


    }
}
