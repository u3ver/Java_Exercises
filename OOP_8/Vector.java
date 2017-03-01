import java.util.Arrays;

/**
 * Определить класс Вектор в R2. Определить несколько конструкторов. Реализовать методы для вычисления модуля вектора,
 * скалярного произведения, сложения, вычитания, умножения на константу. Объявить массив объектов.
 * Написать метод, который для * заданной пары векторов будет определять, являются ли они коллинеарными или ортогональными.
 */
public class Vector {
    private int x = 0;
    private int y = 0;
    private int[] vector = {x, y};

    public void Vektor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void Vektor() {
        this.x = 0;
        this.y = 0;
    }

    public void Vektor(int x) {
        this.x = x;
        this.y = 1;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public final  String getVector() {
        return "[" + this.getX() + ":" + this.getY() + "]";
    }


    public double getAbsVector() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public static double getScalarProduct(Vector a, Vector b) {
        return a.x * b.x + a.y + b.y;
    }

    public static Vector sumAB(Vector a, Vector b) {
        Vector c = new Vector();
        c.Vektor(a.x + b.x, a.y + b.y);
        return c;
    }

    public static Vector subtractAB(Vector a, Vector b) {
        Vector c = new Vector();
        c.Vektor(a.x - b.x, a.y - b.y);
        return c;
    }

    public void prodConst(double x) {
        this.x *= x;
        this.y *= x;
    }

    public  boolean isColinear(Vector b) {
        if (this.x / b.x == this.y / b.y) {
            return true;
        } else return false;
    }

    public boolean isOrtogonal(Vector b) {
        if (getScalarProduct(this, b) == 0) {
            return true;
        } else return false;
    }
}




