import java.util.Scanner;

/**
 *  Начальный вклад в банке равен 1000 руб. Через каждый месяц размер вклада увеличивается
 *  на P процентов от имеющейся суммы (P — вещественное число, 0 < P < 25).
 *  По данному P определить, через сколько месяцев размер вклада превысит 1100 руб.,
 *  и вывести найденное количество месяцев K (целое число) и итоговый размер вклада S (вещественное число).
 */
public class Ex5_1 {
    static int deposit_start = 1000;
    static int deposit_final = 1100;
    static  int K = 0;
    static  double S = 0.0;
    static  int P = 0;

    public static void main(String[] args) {
        init();
        countTerm(P, deposit_start, deposit_final);
        print_term();
    }

    public static void init() {
        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите сумму депозита(Целое число) =\t\t\t");
//        deposit_start = scan.nextInt();
//        System.out.print("Введите конечную депозита(Целое число) =\t\t");
//        deposit_final = scan.nextInt();
//        if (deposit_final < deposit_start) {
//            deposit_final = deposit_start;
//        }
        System.out.print("Введите % ставку от 1 до 25 =\t\t\t\t\t");
        P = scan.nextInt();
        scan.close();
    }

    public static void countTerm(int percent, double deposit, int depositfinal) {
        while (depositfinal>=deposit) {
            deposit =(deposit + (deposit * (percent / 100.0)));
            K++;
        }
        S = ((int)(deposit * 1000.0))/1000.0;
    }

    public static void print_term() {
        System.out.println("Размер вклада привысит "+deposit_final+" через "+K+" месяцев");
        System.out.println("Сумма вклада через "+K+" месяцев будет =\t\t\t"+S);
    }
}
