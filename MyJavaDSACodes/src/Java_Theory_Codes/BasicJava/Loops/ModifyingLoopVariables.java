package Java_Theory_Codes.BasicJava.Loops;

public class ModifyingLoopVariables {
    public static void main(String[] args){
        for (int i=0;i<5;i++){
            if(i==2){
                i++; // Skipping 2
            }
            System.out.println(i);
        }
    }
}
