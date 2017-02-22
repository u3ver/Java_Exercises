/**
 * Created by my on 21.02.2017.
 */
public class Star_pdf {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            String starLine = star(i);
            System.out.println(starLine);
        }
    }

    public static String star(int count) {
        String starLine = "";
        for (int i = 0; i < count; i++) {
            starLine += "*";
        }
        return starLine;
    }
}
