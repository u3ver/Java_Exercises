/**
 * Write a program CarLoan.java that reads in three command-line arguments P, Y, and R and calculates
 * the monthly payments you would have to make over Y years to pay off a P dollar loan at R percent
 * interest compounded monthly. The formula is The formula is

                P r

 payment =  ---------------,  where n = 12 * Y, r = R / (12 * 100)

            1  - (1 + r)^(-n)
 *
 */
public class Ex7_3_CarLoan {
    static int Y = 0;
    static int P = 0;
    static int R = 0;
    public static void main(String[] args) {
        P = Integer.parseInt(args[0]);
        Y = Integer.parseInt(args[1]);
        R = Integer.parseInt(args[2]);
        double loan = ((int)(calcLoan() * 1000)) / 1000.0;
        System.out.println("Месячный платеж составит :\t"+ loan +" $");
    }

    public static double calcLoan() {
        int n = 12 * Y;
        double r = R / (double)(12 * 100);
        double payment = (P * r) / (1 - Math.pow((1 + r), (-n)));
        return payment;
    }
}
