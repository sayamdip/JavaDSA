package Java_Theory_Codes.Methods;

public class AcessModifiers {

    //1) Public
    public static String str="Sayamdip Dey Chaklader";
    //This Can Be Declared Only Outside A Method

    //2) Private-Accessible Only Within The Same Class
    private static double b=5000.0;

    public static void main(String[] args){
        System.out.println(str);

        //2) Private-Accessible Only Within The Same Class
        b-=400;
        System.out.println(b);
        demo.modifiers();
        System.out.println("Number Is= "+demo.a);
    }
}
class demo {
    public static int a =90;
    public static void modifiers() {

        AcessModifiers obj =new AcessModifiers(); // AcessModifiers Is The Constructor Here
        //Here We Are accessing a field through an object reference
        System.out.println(obj.str); //Look Here We Can Access str In Another Class
        // As It Is Public


        // System.out.println(obj.b); //It Is Not Possible Because b Is A Private
    }
}