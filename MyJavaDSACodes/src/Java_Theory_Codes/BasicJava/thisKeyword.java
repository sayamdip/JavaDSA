package Java_Theory_Codes.BasicJava;

public class thisKeyword {
    String name="Sayamdip Dey Chaklader";
    int age=22;
    public void Persons(String name, int age){
        this.name=name; //this Keyword Refers To The Current Object
        this.age=age; // Here this.name, this.age Are Obeject Names
        System.out.println("My Name Is: "+name);
        System.out.println("My Age Is: "+age);
    }
    public static void main(String[] args){
        thisKeyword obj=new thisKeyword();
        obj.Persons("Rick Dey Chaklader",21);
    }
}
