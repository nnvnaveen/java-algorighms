import java.util.Arrays;

/**
 *Program to write a binary representation using recursion
 */
public class BinaryNumbers {

    static int a[] =null;
    static public void Binary(int n) {

        if(n<1){
            Arrays.stream(a).forEach(value -> {
                System.out.print(value);
            });
            System.out.println();
        } else {
            a[n-1]=0;
            Binary(n-1);
            a[n-1]=1;
            Binary(n-1);
        }
    }

    public static void main(String[] args) {
        a=new int[2];
        Binary(2);
    }
}


/** Sample output
    if number 2 out put is the output.
    00
    10
    10
    11
**/
