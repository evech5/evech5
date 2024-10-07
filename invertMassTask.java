import java.util.InputMismatchException;
import java.util.Scanner;
 /*Напишите программу,
которая инвертирует массив
 (меняет порядок элементов на противоположный).*/

        //mass = 1 2 3 4 5
        //       0 1 2 3 4

public class invertMassTask {
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
            System.out.println("Введите размер массива");
            int n = read.nextInt();
            int[] array = new int[n];
            System.out.println("Введите элементы массива");
            for(int i= 0; i < n; i++) {
                array[i] = read.nextInt();
            }
            read.close();
            System.out.print("Содержимое массива: ");
            for (int i = 0;i < n;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
            System.out.print("Содержимое массива: ");
            for (int i = 0;i < n;i++){
                System.out.print(invertMass(array)[i]+" ");
            }
            System.out.print(" (инвертированно)");
        } catch (InputMismatchException myErr) {
            System.err.println("Вы ввели недопутимое значение элемента массива или недопустимый размер массива");
        }

    }
}