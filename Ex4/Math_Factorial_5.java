import java.util.Scanner;

/**
 * Дано целое число N (> 0). Найти произведение N! = 1·2·…·N (N–факториал).
 * Чтобы избежать целочисленного переполнения,
 * вычислять это произведение с помощью вещественной переменной и вывести его как вещественное число.
 */
public class Math_Factorial_5 {
    public static void main(String[] args) {
        double factorial = 1.0D;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое Не отрицательное число =\t");
        int n = scan.nextInt();
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = \t" + factorial);
        } else if (n < 0) {
            System.out.println("Out of Range : введите положительное число");
        } else System.out.println("0! = \t1");
    }
}
