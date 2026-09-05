package Java_Theory_Codes.BasicJava.Operators;
class Parent{
}
class Child extends Parent {
}
public class InstanceOfKeyword {

    public static void main(String[] args){
        Child cobj = new Child();
        if(cobj instanceof Child){
            System.out.println("cobj Is An Instance Of Child Class");
        }
        else{
            System.out.println("cobj Is Not An Instance Of Child Class");
        }
        if(cobj instanceof Parent){
            System.out.println("cobj Is An Instance Of Parent Class");
        }
        else{
            System.out.println("cobj Is Not An Instance Of Parent Class");
        }
        if(cobj instanceof Object){
            System.out.println("cobj Is An Instance Of Object");
        }
        else{
            System.out.println("cobj Is Not An Instance Of Object");
        }
    }
}
