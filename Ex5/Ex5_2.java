import java.util.Scanner;

/**
 * Дано целое число N (> 0).
 * Используя операции деления нацело и взятия остатка от деления,
 * вывести все его цифры, начиная с самой правой (разряда единиц).
 */
public class Ex5_2 {
    static int multiplier = 10;
    static long digit = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число :\t");
        long dig = scan.nextInt();
        digit = dig;
        print_digits_reverse();

    }

    public static long devide_digits() {
        long lastDigit = -1;
        if (digit * 10 / multiplier > 0) {
            lastDigit = digit % multiplier;
            digit = digit / multiplier;
        }
        return lastDigit;
    }

    public static void print_digits_reverse() {
        do {
            System.out.println(devide_digits());
        } while ((int) (digit * 10 / multiplier) > 0);
    }
}

