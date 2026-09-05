package Java_Theory_Codes.BasicJava.Operators.LogicalOperators;

public class LogicalANDOperator {
    public static void main(String[] args){
        int a=30,b=40,c=40,d;
        System.out.println("Var1="+a);
        System.out.println("Var2="+b);
        System.out.println("Var3="+c);

        if((a<b) && (b==c)){  // If The First Condition Becomes False, Then It Will Not Check Further. This Concept Is
                             // Called Short-Circuiting In AND.
            d=a+b+c;
            System.out.println("The Sum Is= "+d);
        }
        else{
            System.out.println("False Conditions");
        }
    }
}
