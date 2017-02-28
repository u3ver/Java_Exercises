/**
 * Created by my on 28.02.2017.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector[] arr = new Vector[4];
        // ошибка не принимает аргументы
        arr[0] = new Vector(2,4); 
        System.out.println(arr[0].getX()+":"+arr[0].getY());
        Vector vectorA = new Vector();
        Vector vectorB = new Vector();

        vectorA.Vektor(3, 7);
        vectorB.Vektor(1, -5);

        System.out.println("Длинна вектора a =\t\t" + vectorA.getAbsVector());
        System.out.println("Длинна вектора b =\t\t" + vectorB.getAbsVector());
        System.out.println();

        System.out.println("Скалярное произведения векторов = \t" + Vector.getScalarProduct(vectorA, vectorB));

        Vector vectorC = Vector.sumAB(vectorA, vectorB);
        System.out.println("А + B =\t\t"+vectorC.getX()+" : "+vectorC.getY());

        Vector vectorD = Vector.subtractAB(vectorA, vectorB);
        System.out.println("А - B =\t\t"+vectorD.getX()+" : "+vectorD.getY());

        vectorA.prodConst(3);
        System.out.println("A умножить на константу Х(3) = "+ vectorA.getX()+" : "+vectorA.getY());
    }
}
