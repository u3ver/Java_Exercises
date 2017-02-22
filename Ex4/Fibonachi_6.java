import java.util.Scanner;

/**
 * Дано целое число N (> 1). Последовательность чисел Фибоначчи FK (целого типа) определяется
 * следующим образом: F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, … . Вывести элементы F1, F2, ..., FN.
 */
public class Fibonachi_6 {
    public static void main(String[] args) {
        int F1 = 1;
        int F2 = 1;
        int fn = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число >2 =\t");
        int n = scan.nextInt();
//        вывод F1 F2
        System.out.println("F[1] =\t" + F1);
        System.out.println("F[2] =\t" + F2);
//         рачет/вывод всего остального
        for (int i = 3; i <= n; i++) {
            fn = F1 + F2;
            F1 = F2;
            F2 = fn;
            System.out.println("F[" + i + "] =\t" + fn);
        }
    }
}
