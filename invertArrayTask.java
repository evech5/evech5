import java.util.InputMismatchException;
import java.util.Scanner;

 /*Write a program
which inverts the array
 (reverses the order of elements).*/

public class invertArrayTask {
    static int[] invertMass(int[] mass){
        int n = mass.length-1;
        int [] massRev = new int[mass.length];
        for (int i = 0; i < mass.length; i++,n--){
            massRev[i] = mass[n];
        }
        return massRev;
    }
    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(System.in);
            System.out.println("Enter array size");
            int n = read.nextInt();
            int[] array = new int[n];
            System.out.println("Enter Array Elements");
            for(int i= 0; i < n; i++) {
                array[i] = read.nextInt();
            }
            read.close();
            System.out.print("Array contents: ");
            for (int i = 0;i < n;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
            System.out.print("Array contents: ");
            for (int i = 0;i < n;i++){
                System.out.print(invertMass(array)[i]+" ");
            }
            System.out.print(" (inverted)");
        } catch (InputMismatchException myErr) {
            System.err.println("You entered an invalid array element value or an invalid array size");
        }
    }
}