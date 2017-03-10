import java.util.Arrays;

/**
 * Определить класс Дробь в виде пары (m,n).
 * Класс должен содержать несколько конструкторов.
 * Реализовать методы для сложения, вычитания, умножения и деления дробей.
 * Объявить массив из k дробей,
 * ввести/вы- вести значения для массива дробей.
 * <p>
 * Создать массив объектов и передать его в метод,
 * который изменяет каждый элемент массива с четным индексом
 * путем добавления следующего за ним элемента  * массива.
 */
public class Fraction {
    private  int ch = 0;
    private  int znam = 0;


    public Fraction() {
    }

    public Fraction(int ch, int znam) {
        this.ch = ch;
        this.znam = znam;
    }

    public  double getCh() {
        return this.ch;
    }

    public double getZnam() {
        return this.znam;
    }

    public int setCh(int ch) {
        return this.ch = ch;
    }

    public int setZnam(int znam) {
        return this.znam = znam;
    }

    public void printCh() {
        System.out.println(this.ch);
    }

    public void printZnam() {
        System.out.println(this.znam);
    }

    //    public boolean isKratnoe() {
//
//    }

    private static int[] common_denominator(Fraction a, Fraction b) {
        int[] mnojiteli = new int[3];
        int common_znam = 0;
        common_znam = a.znam * b.znam;
        mnojiteli[0] = b.znam;
        mnojiteli[1] = a.znam;
        mnojiteli[2] = common_znam;
        return mnojiteli;
    }

    public static Fraction  add(Fraction a, Fraction b) {
        Fraction res = new Fraction();
        if (a.znam == b.znam) {
            res.ch = a.ch + b.ch;
            res.znam = a.znam;
        } else {
            int[] common_den = common_denominator(a, b);
            res.ch = a.ch * common_den[0] + b.ch * common_den[1];
            res.znam = common_den[2];
        }
        return res;
    }

    public Fraction subtract(Fraction a, Fraction b) {
        Fraction res = new Fraction();
        if (a.znam == b.znam) {
            res.ch = a.ch - b.ch;
            res.znam = a.znam;
        } else {
            int[] common_den = common_denominator(a, b);
            res.ch = a.ch * common_den[0] - b.ch * common_den[1];
            res.znam = common_den[2];
        }
        return res;
    }

    public Fraction multiply(Fraction a, Fraction b) {
        Fraction res = new Fraction();
        res.ch = a.ch * b.ch;
        res.znam = a.znam * b.znam;
        return res;
    }

    public Fraction divide(Fraction a, Fraction b) {
        Fraction res = new Fraction();
        res.ch = a.ch * b.znam;
        res.znam = a.znam * b.ch;
        return res;
    }

    public static Fraction[] transform(Fraction[] arr) {
        for (int i = 0; i < arr.length ; i +=2) {
            arr[i] = add(arr[i], arr[i + 1]);
        }
        return arr;
    }

    public static String toString(Fraction fraction) {
        return "" + fraction.ch + " | " + fraction.znam;
    }

    public static String toString(Fraction[] fraction) {
        String s ="";
        for (Fraction f: fraction) {
            s += toString(f) + "\n";
        }
        return s;
    }
}

