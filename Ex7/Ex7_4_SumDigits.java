import java.util.Scanner;

/**
 *  Напишите программу определяющую сумму цифр любого введенного как аргумент командной строки целого положительного числа.
 */
public class Ex7_4_SumDigits {
    static int factor = 10;
    public static void main(String[] args) {
        int sum = sumDigit(input());
        System.out.println("Сумма цифр введенного числа = " + sum);
    }

    public static int sumDigit(int x) {
        int sum = 0;
        while (x * 10 != 0) {
            sum += x % factor;
            x = x / factor;
        }
        return sum;
    }

    public static int input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое положительное число :\t");
        return  scan.nextInt();
    }
}
