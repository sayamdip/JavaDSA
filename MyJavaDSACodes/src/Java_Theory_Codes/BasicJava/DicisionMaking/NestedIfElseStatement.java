package Java_Theory_Codes.BasicJava.DicisionMaking;

public class NestedIfElseStatement {
    public static void main(String[] args){
        int age=25;
        double weight=65.5;
        if(age>=18){
            if(weight>=50.0){
                System.out.println("You Are Eligible To Donate Blood.");
            }
            else{
                System.out.println("You Must Weight Atleast 50 KG To Donate Blood.");
            }
        }
        else{
            System.out.println("You Must Be At Least 18 Years Old To Donate Blood.");
        }
    }
}
