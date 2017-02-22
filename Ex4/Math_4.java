/**
 * Дано вещественное число A и целое число N (> 0).
 * Используя один цикл, найти значение выражения 1 – A + A2 – A3 + … + (–1)N·AN.
 * Условный оператор не использовать.
 */
public class Math_4 {
    public static void main(String[] args) {

    }
}
/**
 *     program for17;

 var
 A, Pow, Sum: real;
 N, i: integer;

 begin
 write('Введите A и N: ');
 read(A, N);
 Pow := 1;
 Sum := 1;
 for i := 1 to N do
 begin
 Pow := Pow * A; // Узнаем следующую степень числа А
 Sum := Sum + Pow; // Увеличиваем сумму на эту степень
 end;
 write('Сумма 1 + ... + A в степени N равно ', Sum);
 end.
 *
 */