package Java_Theory_Codes.BasicJava.JumpStatement;

public class UseBreakAsAFormOfGoto {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            one:
            { //Label One
                two:
                { //Label Two
                    three:
                    { // Label Three
                        System.out.println("i=" + i);
                        if (i == 0)
                            break one;
                        if (i == 1)
                            break two;
                        if (i == 2)
                            break three;
                    }
                    System.out.println("After Label Three");
                }
                System.out.println("After Label Two");
            }
            System.out.println("After Label One");
        }
    }
}
