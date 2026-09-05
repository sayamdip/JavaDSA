package Java_Theory_Codes.BasicJava.Operators.LogicalOperators;

public class LogicalNOTOperator {
    public static void main(String[] args){
        int a=40,b=30;
        System.out.println("Var1= "+a);
        System.out.println("Var2= "+b);

        // Using Logical Not Operator
        System.out.print("!(a<b)= "+!(a<b)+" "); // Logical NOT Operator Just Converses True To False And False To True
        System.out.print("!(a>b)= "+!(a>b));
    }
}
