package DSA_Theory_Codes.Arrays;

public class Arrays {
    public static void main(String[] args){
        // Primitive Data Type Array
        int[] arr={1,2,3,4,5};
        int a = arr.length;
        System.out.print("Primitive Array -> ");
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();

        //Non-Primitive String Data Type Array
        String[] loca={"Kolkata","Mumbai","Delhi","Chennai"};
        System.out.print("Non-Primitive Array -> ");
        for(int j=0; j<loca.length;j++){
            System.out.print(loca[j]+", ");
        }
        System.out.println();

        // Arrays of Objects in Java
        int[] array = new int[5];
        array[0]=12;
        array[1]=14;
        array[2]=15;
        array[3]=16;
        array[4]=20;

        // Operations On Array Elements

        // 1) Access Array Elements
        System.out.print("1) Array Elements -> ");
        for(int k=0;k<array.length;k++){
            System.out.print(array[k]+", ");
        }
        System.out.println();

        // 2) Update Array Elements
        array[3]= 56;
        System.out.print("2) Updated Array -> ");
        for(int l=0; l<array.length;l++){
            System.out.print(array[l]+", ");
        }

        System.out.println();

        // 3) Traverse Array
        System.out.print("3) Traversing An Array -> ");
        for(int m=0;m<array.length;m++){
            System.out.print(array[m]+", ");
        }

        System.out.println();

        // 4) Size Of Array
        System.out.print("4) Size Of Array -> "+array.length);
    }
}
