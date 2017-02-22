import java.util.Random;
import java.util.Scanner;

/**
 * Created by my on 22.02.2017.
 */
//        Clubs Black   	♠ 	♠ 	\u2660;
//        Hearts Black  	♥ 	♥ 	\u2665;
//        Diamonds Black 	♦ 	♦ 	\u2666;
//        Spades Black  	♣ 	♣ 	\u2663;
public class Shuffle_Cards {
    static String[] deck = new String[36];

    public static void main(String[] args) {
        final Random random = new Random();
        int indexArr = 0;

//        Забиваем карточную колоду

        for (int i = 1; i <= 4; i++) {
            char c = 0;
            switch (i) {
                case 1:
                    c = '\u2660';
                    break;
                case 2:
                    c = '\u2665';
                    break;
                case 3:
                    c = '\u2666';
                    break;
                case 4:
                    c = '\u2663';
                    break;
            }
            for (int j = 6; j <= 14; j++) {
                deck[indexArr] = Integer.toString(j) + c;

                indexArr++;
            }
        }
        output();
        Scanner scan = new Scanner(System.in);
        System.out.println("Управляемое тасование карта введите q/w/e/a/s/d символ для действия");
        System.out.println("Введите n для выхода");
        char ch = '0';
        while (ch != 'n') {
            ch = scan.next(".").charAt(0);;
            switch (ch) {
                case 'q':
//               Берем случайно от 1-8 карт
                    String swap = "";
                    int colCard = random.nextInt(8) + 1;
                    for (int i = 0; i <= colCard; i++) {
                        swap = deck[deck.length - colCard + i - 1];
                        deck[deck.length - colCard + i - 1] = deck[i];
                        deck[i] = swap;










                    }
                    break;
                case 'n':
                    break;
            }
            output();
        }
    }

    public static void output() {
        //                вывод колоды
        for (int i = 0; i < deck.length; i++) {
            System.out.println("deck [" + i + "] = " + deck[i]);
        }
    }
}
