package Java_Theory_Codes.BasicJava.JumpStatement;

public class ContinueStatementInsideDoWhileLoop {
    public static void main(String[] args){
        int i=0;
        do{
            if(i==3){
                i++;
                continue;
            }
            System.out.print(i+" ");
            i++;
        }while(i<=5);
    }
}
