import java.util.Random;

/**
 * Определить класс Матрица размерности (m x n).
 * Класс должен содержать несколько конструкторов. Объявить массив объектов.
 * Передать объекты в метод, меняющий местами строки с максимальным и минимальным элементами k-го столбца.
 * Создать метод, который изменяет i-ю строку матрицы путем возведения ее в квадрат.
 */
public class GoPro {
    static int arrSize = 3;
    public static void main(String[] args) {
        initMatix();

    }

    public static void initMatix() {
        Matrix[] MatrixArr = new Matrix[arrSize];
        Random random = new Random();
        for (int i = 0; i < arrSize ; i++) {
            MatrixArr[i] = new Matrix(3, 4);
            MatrixArr[i].setRandomMatrix(20);
            System.out.println();
        }
    }
}




