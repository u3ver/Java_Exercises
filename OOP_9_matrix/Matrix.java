import java.util.Random;

/**
 * Определить класс Матрица размерности (m row n).
 * Класс должен содержать несколько конструкторов. Объявить массив объектов.
 * Передать объекты в метод, меняющий местами строки с максимальным и минимальным элементами k-го столбца.
 * Создать метод, который изменяет i-ю строку матрицы путем возведения ее в квадрат.
 */
public class Matrix {
    private static int row = 2;
    private static int col = 1;
    private static int minRow = 0;
    private static int minColumn = 0;
    private static int maxRow = 0;
    private static int maxColumn = 0;
    private static int[][] arr;
    private static Random rand = new Random();

    public Matrix() {
    }

    public Matrix(int row) {
        this.row = Math.abs(row);
    }

    public Matrix(int row, int y) {
        this.row = Math.abs(row);
        this.col = Math.abs(y);
        arr = new int[this.row][this.col];
    }

    public static void setRandomMatrix(int randomLimit) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = rand.nextInt(randomLimit) + 1;
            }
        }
    }

    public static int MinElemColumn(int column) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < row; i++) {
            minColumn = column;
            if (min > arr[i][column]) {
                min = arr[i][column];
                minRow = i;
            }
        }
        return min;
    }

    public static int MaxElemColumn(int column) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            maxColumn = column;
            if (max < arr[i][column]) {
                max = arr[i][column];
                maxRow = i;
            }
        }
        return max;
    }

    public static void swapMinMaxColumns(int column) {
        int temp = 0;
        MinElemColumn(column);
        MaxElemColumn(column);

        for (int i = 0; i < col ; i++) {
            temp = arr[minRow][i];
            arr[minRow][i] = arr[maxRow][i];
            arr[maxRow][i] = temp;
        }
    }


}
