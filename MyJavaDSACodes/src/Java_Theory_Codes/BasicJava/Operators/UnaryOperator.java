package Java_Theory_Codes.BasicJava.Operators;

public class UnaryOperator {
    public static void main(String[] args){
        //1) Unary Minus
        int a=40;
        int b=-a;
        System.out.println("Unary Minus= "+b);

        //2) Not Operator (!)
        boolean c=true;
        boolean p=!c;
        System.out.println("Not Operator= "+p);

        //3) Operator Increment (++)

        //Post-Increment
        int d=a++;
        System.out.println("After Using Post-Increment (Returns Old Value)= "+d);
        System.out.println("Now Actual (New Value)= "+a);
        //Pre-Increment
        int h=++a;
        System.out.println("Operator Pre-Increment= "+h);

        //4) Operator Decrement (--)

        //Post-Decrement
        int e=d--;
        System.out.println("After Using Post-Decrement It Returns (Old Value)= "+e);
        System.out.println("Now Returns Actual (New-Value)= "+d);

        //Pre-Decrement
        int k=--d;
        System.out.println("Operator Pre-Decrement= "+k);

        //5) Bitwise Component (~)
        int n1=6;
        int n2=-2;
        System.out.println("Bitwise Operation= "+~n1); //Formula: ~a= -(a+1)
        System.out.println("Bitwise Operation= "+~n2);


    }
}
