package DSA_Theory_Codes.Arrays;
import java.util.*;
public class arrayList {
    public static void main(String[] args){
        // ArrayList In Java Is A Resizable Array
        ArrayList<Integer> a = new ArrayList<>(); // This Is The Syntax

        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        System.out.println(a);

        ArrayList<String> str=new ArrayList<>();
        // Methods Of ArrayList

        // Check For More- https://www.geeksforgeeks.org/java/arraylist-in-java/

        // 1) Adding Elements at the specific index
        str.add(0,"RDJ"); // add()
        str.add(1,"Sayamdip");
        str.add(2,"Rick");
        str.add(3,"Ram");
        str.add(4,"Shyam");
        System.out.println(str);


        // 2) Removing Elements Using Index
        str.remove(3);  // remove()
        System.out.println(str);

        //3) Update Value At Index 0
        str.set(0,"Arijit");  // set()
        System.out.println(str);

        //4) To Find Size Of An Array
        System.out.println("Size= "+str.size()); //size()

        // 5) Returns the element at the specified position in this list
        System.out.println("At 1th Position= "+str.get(1)); // get()

        // 6) The index the first occurrence of a specific element
        System.out.println("Shyam At Position= "+str.indexOf("Shyam")); // indexOf()

        // 7)
        str.trimToSize();
        System.out.println(str);
    }

}
