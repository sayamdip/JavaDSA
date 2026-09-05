package Java_Theory_Codes.Methods;

public class InstanceMethod {
    String name="Alice";
    void greet(){
        System.out.println("Hello, "+name+"!");
    }
    public static void main(String[] args){
        InstanceMethod p=new InstanceMethod();
        p.greet();
        System.out.println(p.name);
    }
}
