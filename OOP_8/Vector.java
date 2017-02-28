import java.util.Arrays;

/**
 * Определить класс Вектор в R2. Определить несколько конструкторов. Реализовать методы для вычисления модуля вектора,
 * скалярного произведения, сложения, вычитания, умножения на константу. Объявить массив объектов.
 * Написать метод, который для * заданной пары векторов будет определять, являются ли они коллинеарными или ортогональными.
 */
public class Vector {
    private int x = 0;
    private int y = 0;

    public void Vektor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void Vektor() {
        this.x = 1;
        this.y = 1;
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


    public double getAbsVector() {
//        Формулы длины вектора |a| = √ax2 + ay2
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public static double getScalarProduct(Vector a, Vector b) {
//     Формула скалярного произведения векторов для плоских задач
//     a · b = ax · bx + ay · by

        return a.x * b.x + a.y + b.y;
    }

    public static Vector sumAB(Vector a, Vector b) {
//        a + b = {ax + bx; ay + by}
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
}




