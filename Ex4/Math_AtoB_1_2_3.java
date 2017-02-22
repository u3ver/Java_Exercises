import java.util.Scanner;

/**
 * Даны два целых числа A и B (A < B). Найти сумму всех целых чисел от A до B включительно.
 *
 * Даны два целых числа A и B (A < B). Найти произведение всех целых чисел от A до B включительно.
 *
 * Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых чисел от A до B включительно.
 */
public class Math_AtoB_1_2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число A =\t");
        int a = scan.nextInt();
        System.out.print("Введите целое число B =\t");
        int b = scan.nextInt();
        int sum = 0;
        int product = 1;
        int squareSum = 0;
        if (a > b) {
            int swapInt = a;
            a = b;
            b = swapInt;
            System.out.println("A > B ==> меняем их местами");
        }
        for (int i = a; i <=b ; i++) {
            sum += i;
            product *= i;
            squareSum += i * i;
        }
        System.out.println("Cумма всех целых чисел от A до B включительно =\t" + sum);
        System.out.println("Произведение всех целых чисел от A до B включительно =\t" + product);
        System.out.println("Сумма квадратов всех целых чисел от A до B включительно =\t" + squareSum);
    }
}
