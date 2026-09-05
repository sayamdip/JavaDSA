package Java_Theory_Codes.BasicJava;

public class MethodsOfWrapperClasses {
    public static void main(String[] args){

        //1) (Wrapper Class).parseXxx(s)- Converts A String Into Its Corresponding
            //Primitive Data Type.
        int a=357;
        Integer d=a;

        //2) (Wrapper Class).valueOf(s)- Converts A String Into A Wrapper Object.
        String s=String.valueOf(a);
        System.out.println(a);

        //Changing
        int c=Integer.parseInt(s);
        System.out.println(c);

        int b=258;

        //3) (Wrapper Class).valueOf(a)- Converts A Primitive Value To Its
             //Corresponding Wrapper Object.
        // This Is Another Method To Convert A Primitive Data Type To Its Wrapper Class
        // Object.

        Integer o=Integer.valueOf(b);
        System.out.println(o);

        //4) xxxValue()- Converts A Wrapper Object Into Its Primitive Type.
        int p=o.intValue();
        System.out.println(p);

        //5) toString()- Converts A Wrapper Object Into String.
        String k=o.toString();
        System.out.println(k);

        //6) Object.equals(Object)- Compares Values
        boolean t=d.equals(o); // Only Objects Can Be Compared Not Primitive Types
        System.out.println(t);

        //7) (Wrapper Class).min(x,y)- Find Minimum Value Between Two Objects
        System.out.println(Integer.min(d,o));

        //8) (Wrapper Class).max(x,y)- Find The Maximum Value Between Two Objects
        System.out.println(Integer.max(d,o));

        //9) (Object).compareTo(Object)- Compare Two Wrapper Objects
        System.out.println(d.compareTo(o));

        //10) (Wrapper Class).compare(x,y)- Compare Two Primitive Data Types
        System.out.println(Integer.compare(a,b));
    }
}
