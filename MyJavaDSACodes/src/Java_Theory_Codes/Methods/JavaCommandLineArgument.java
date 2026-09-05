package Java_Theory_Codes.Methods;

public class JavaCommandLineArgument {
    public static void main(String[] args){
        System.out.println("Number Of Arguments= "+args.length);
        for(int i=0;i<args.length;i++){
            System.out.println("Argument "+i+"= "+args[i]);
        }
    }
}
