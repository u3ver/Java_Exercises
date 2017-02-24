import java.util.Scanner;

/**
 * Дано целое число N (> 1). Последовательность чисел Фибоначчи FK определяется
 * следующим образом: F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, … .
 * Проверить, является ли число N числом Фибоначчи. Если является,
 * то вывести True, если нет — вывести False.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 */
public class Ex5_4_isFibonachi {
    public static void main(String[] args) {
        boolean isFib;
        int num = input();
        isFib = isFibonachi(num);
        System.out.println(isFib);
    }

    public static int input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое  число > 0 для проверки  :\t");
        int num = Math.abs(scan.nextInt());
        return num;
    }

    public static boolean isFibonachi(int num) {
        boolean isFib = false;
        int f1 = 1;
        int f2 = 1;
        int fn = 1;
        if (num == 0) {
            isFib = true;
            return isFib;
        }

        for (int i = 0; i < num; i++) {
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
            if (fn == num) {
                isFib = true;
                break;
            }
        }
        return isFib;
    }
}
