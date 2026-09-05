package DSA_Theory_Codes.Arrays;

public class PassingArraysToMethods {
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        adding(a);

    }

    public static void adding(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum Of Elements= "+sum);
    }
}
