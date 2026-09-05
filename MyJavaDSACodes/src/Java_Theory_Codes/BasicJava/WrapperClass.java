package Java_Theory_Codes.BasicJava;

public class WrapperClass {
    public static void main(String[] args){
        //1) Integer Wrapper Class
        int b = 357;
        Integer a = b; // Object Of Their Corresponding Wrapper Class

        // This Is Autoboxing (Primitive Variable -> Wrapper Object)
        System.out.println("The Primitive int b Is: "+b);
        System.out.println("The Integer Object a Is: "+a);

        // This Is Unboxing (Wrapper Object -> Primitive Variable)
        Integer e = 50;
        int primitiveobj = e;
        System.out.println("This Is The Primitive Data: "+primitiveobj);

        //2) Character Wrapper Class
        char ch='a';
        Character c = ch;
        System.out.println("The Primitive char ch Is: "+ch);
        System.out.println("The Character Object c Is: "+c);

        // Converting A String Value To Integer Value
        String str = "100";
        int num = Integer.parseInt(str);
        System.out.println("String Value: " +str+" To Integer Value: "+num);

        // Converting Integer To String
        int num2 = 40;
        String str2 = Integer.toString(num2);
        String str3 = str2+str;
        System.out.println("To String Value: "+str3);


    }
}
