package Java_Theory_Codes.Methods;

public class StaticMethod {
    static int a=40;
    static int b=50;
    public static void Geeks(){
        System.out.println("Hello World!");
        System.out.println(a);
    }
    public static void main(String[] args){
        StaticMethod.Geeks(); // You Can Call A Static Method Simply By Geeks() Only.
        Geeks();
        System.out.println(b);

    }
}
class Test{
    public static void test(){
        StaticMethod.Geeks();
    }
}
