import java.util.Scanner;

/**
 * Дано целое число N (> 1). Если оно является простым,
 * то есть не имеет положительных делителей, кроме 1 и самого себя,
 * то вывести True, иначе вывести False.
 */
public class Ex5_3 {
    static int N = 0;
    public static void main(String[] args) {
        input();
        boolean isNatur = isNatural(N);
        System.out.println(isNatur);
    }

    public static boolean isNatural(int testN) {
        boolean isNatural = false;
        int i = 2;
        while (i < testN - 1) {
            if (testN % i == 0) {
                isNatural = true;
                break;
            }
            i++;
        }
        return isNatural;
    }

    public static void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое положительное число :\t");
        N = Math.abs(scan.nextInt());

        scan.close();
    }
}
