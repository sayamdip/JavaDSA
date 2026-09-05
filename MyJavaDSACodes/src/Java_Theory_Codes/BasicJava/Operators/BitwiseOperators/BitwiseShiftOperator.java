package Java_Theory_Codes.BasicJava.Operators.BitwiseOperators;

public class BitwiseShiftOperator {
    public static void main(String[] args){
        int a=5,b=-5;
        // Bitwise Left Shift Operator
        System.out.println(a+"<<1"+"= "+(a<<1));
        // Bitwise Right Shift Operator
        System.out.println(a+">>2= "+(a>>2));
        // Bitwise Unsigned Right Shift Operator
        System.out.println(b+">>>1"+"= "+(b>>>1));
    }
}
