import java.util.Arrays;
import java.util.Random;

/**
 * Дано целое число K и массив из десяти целых ненулевых чисел.
 * Вывести номер первого числа в массиве, большего K. Если таких чисел нет, то вывести 0.
 */

public class Ex6_4_5 {
    static int[] array = new int[10];
    static int k = 7;
    public static void main(String[] args) {
        initialize();
        output();
    }

    public static void initialize() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10) + 1;
        }
    }

    public static int firstMaxK() {
        for (int i = 0; i < array.length; i++) {
            if (k < array[i]) {
                return i;
            }
        }
        return 0;
    }

    public static int lastMaxK() {
        for (int i = array.length-1 ; i >= 0; i--) {
            if (k < array[i]) {
                return i;
            }
        }
        return 0;
    }

    public static void output() {
        System.out.println(Arrays.toString(array));
        System.out.println("Индекс первого элемента >\t\t\t"+k+" = "+firstMaxK());
        System.out.println("Индекс последнего элемента >\t\t"+k+" = "+lastMaxK());
    }
}
