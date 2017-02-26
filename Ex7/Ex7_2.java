import java.util.Random;

/**
 *  Write a program  that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).
 */
public class Ex7_2 {
    public static void main(String[] args) {
        System.out.println("очков за бросок 2x костей  = "+(rollingDice()+rollingDice()));
    }

    public static int rollingDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
