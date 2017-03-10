import java.util.Random;

/**
 * Created by my on 07.03.2017.
 */
public class Main {
    static Fraction[] arr;
    public static void main(String[] args) {
        initFracArray(Integer.parseInt(args[0]));


    }

    public static void initFracArray(int n) {
        Fraction[] arr = new Fraction[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = new Fraction(rand.nextInt(10) + 1, rand.nextInt(15) + 1);
        }

        System.out.println(Fraction.toString(arr));
        System.out.println();
        Fraction.transform(arr);
        System.out.println(Fraction.toString(arr));
    }
}
