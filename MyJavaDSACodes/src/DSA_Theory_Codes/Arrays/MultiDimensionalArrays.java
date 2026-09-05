package DSA_Theory_Codes.Arrays;
import java.util.*;

public class MultiDimensionalArrays {
    public static void main(String[] args){
        // User Defined 2-D Array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Rows= ");
        int n=sc.nextInt();
        System.out.print("Enter Number Columns= ");
        int m=sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Enter Elements= ");
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("2-D Arrays= ");
        for(int k=0;k<n;k++){
            for(int l=0; l<m;l++){
                System.out.print(arr[k][l]+" ");
            }
            System.out.println();
        }
    }
}
