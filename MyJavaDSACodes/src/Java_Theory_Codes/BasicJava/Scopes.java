package Java_Theory_Codes.BasicJava;

public class Scopes {
    class Test{

        //1) Static Scope
        static int a=357;
    }
    public static void main(String[] args){

        //2) Block Level Scope-Declared Here
        int a=1000; //This Is A Local Variable

        System.out.print(Test.a);

        //3) Method Level Scope-Variables Declared Inside A Method Can Only Be Used
        //                      By That Method Only.

        System.out.println(a);
    }
}
