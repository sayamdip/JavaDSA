package Java_Theory_Codes.BasicJava.Loops;
import java.util.*;
public class SumOfEvenAndOddIntegersOfTheFirstNNaturalNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Natural Numbers Limit= ");
        int a=sc.nextInt();
        int even=0,odd=0;
        for(int i=0;i<=a;i++){
            if(i%2==0){
                even=even+i;
            }
            else{
                odd=odd+i;
            }
        }
        System.out.println("Sum Of Even Numbers= "+even);
        System.out.println("Sum Of Odd Numbers= "+odd);
    }
}
