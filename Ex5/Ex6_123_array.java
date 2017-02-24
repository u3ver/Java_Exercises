import java.util.Arrays;
import java.util.Random;

/**
 *  Дан массив из десяти целых чисел. Найти их сумму.
 *
 *  Дан массив из десяти целых чисел. Найти их произведение.
 *
 *  Дан массив из десяти целых чисел. Найти их среднее арифметическое.
 */
public class Ex6_123_array {

    static int[] array = new int[10];

    public static void main(String[] args) {
        input();
        output();

    }

    public static void input() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5)+1;
        }
    }

    public static int sumArray() {
        int sumArr = 0;
        for (int x : array) {
            sumArr += x;
        }
        return sumArr;
    }

    public static int product() {
        int prodArr = 1;
        for (int x : array) {
            prodArr *= x;
        }
        return prodArr;
    }

    public static double average() {
        double aver = sumArray() / (double)array.length;
        return aver;
    }

    public static void output() {
        System.out.println("Дан массив :\n"+ Arrays.toString(array)+"\n\n");
        System.out.println("Сумма элементов массива =\t\t\t\t\t" + sumArray());
        System.out.println("Произведение элементов массива =\t\t\t" + product());
        System.out.println("Среднее арифметической элементов массива =\t"+average());
    }
}

