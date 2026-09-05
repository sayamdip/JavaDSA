package Java_Theory_Codes.BasicJava.Operators.LogicalOperators;

public class LogicalOrOperator {
    public static void main(String[] args){
        int a=60,b=40,c=50, d=40;
        System.out.println("Var1= "+a);
        System.out.println("Var2= "+b);
        System.out.println("Var3= "+c);

        if(a>b || c==d){  // If One The First Condition Is True, It Will Not Check Further. This Concept Is Called
                         // Short-Circuiting In OR.
            System.out.println("One Or Both The Condition Are True");
        }
        else{
            System.out.println("Both The + Conditions Are False");
        }
    }
}
