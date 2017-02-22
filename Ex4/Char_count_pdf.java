import java.util.Scanner;

/**
 * Created by my on 21.02.2017.
 */

public class Char_count_pdf {
    static int col = 0;
    public static void main(String[] args) {
        String testString = "котёнок";
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите символ для поиска :\t");
        char ch = scan.findInLine(".").charAt(0);
        countChars(testString, ch);
        System.out.println("символ "+ch+" в строке встречается "+col+" раз" );
}

    public static void countChars(String string, char ch) {
        int x = -1;
        for (int i = 0; i <string.length() ; i++) {
            x = string.indexOf(ch, i);
            if (x == -1) {
                break;
            }
            i = x;
            col++;
        }
    }
}
