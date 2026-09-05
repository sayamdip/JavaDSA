package Java_Theory_Codes.BasicJava.JumpStatement;

public class ContinueStatementInsideWhileLoop {
    public static void main(String[] args){
        int c=0;
        while(c<=5){
            if(c==3){
                c++;
                continue;
            }
            System.out.print(c+" ");
            c++;
        }
    }
}
