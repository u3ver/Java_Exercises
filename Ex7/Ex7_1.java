import java.util.Random;

/**
 * Write a program that takes two int values a and b from the command line and prints a random integer between a and b.
 */
public class Ex7_1 {

    public static void main(String[] args) {
        int a = Math.abs(Integer.parseInt(args[0]));
        int b = Math.abs(Integer.parseInt(args[1]));
        System.out.println("случайное число в промежутке от " + a + " до " + b + "\t=\t" + randAtoB(a,b));
    }

    public static int randAtoB(int a, int b) {
        if (a > b) {
            b = b + a;
            a = b - a;
            b = b - a;
        }
        Random random = new Random();
        return random.nextInt(b - a+1) + a;
    }
}
