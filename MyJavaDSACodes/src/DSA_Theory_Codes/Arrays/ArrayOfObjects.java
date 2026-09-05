package DSA_Theory_Codes.Arrays;

class Student{
    public int roll_no;
    public String name;

    Student(int roll_no, String name){
        this.roll_no=roll_no;
        this.name = name;
    }
}

public class ArrayOfObjects {
    public static void main(String[] args){
    //Example: Create an array of five Student objects by instantiating each Student using its constructor and storing their references in the array.

        // Declares and creates the array at the same time
        Student[] arr = new Student[5];

        // initialize the elements of the array And Stores The Memory Address To Each Positions Of The Array
        arr[0]=new Student(1,"Arun");
        arr[1]=new Student(2,"Rahul");
        arr[2]=new Student(3,"Ram");
        arr[3]=new Student(4,"Shaym");
        arr[4]=new Student(5,"Sheetal");

        for(int i=0;i<arr.length;i++){
            System.out.println("At "+i+" Position= ("+arr[i].roll_no+", "+arr[i].name+")");
        }

    }
}
