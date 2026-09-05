package Java_Theory_Codes.Methods;

public class VariableArgumentsInJavaMethods {
    public void Name(String... n){ // This Is An Instance Method
        for(String i:n){
            System.out.print(i+", ");
        }
    }
    public static void main(String[] args){
        VariableArgumentsInJavaMethods obj=new VariableArgumentsInJavaMethods();
        obj.Name("Sayamdip","Dey","Chaklader","Rick","Dey","Chaklader");
    }
}
