package Exercise6_3;

public class GaussSeriesCal {

    public static double gauss (double x, int n) {
        double fac = 1.0;
        int quad = 1;
        int minusONe = 1;
        int onOff = 1;
        double sum = 1 - x*x;
        for (int i = 2; i <= n-1; i++) { // factorial
            fac *= i;
            onOff *= minusONe;
            for (int j = 1; j <= 2*i; j++) {
                quad *= x;

            }
            sum += (onOff * (quad/fac));
            quad = 1;
            minusONe = -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        double x = 2;
        int n = 5;
        double result = gauss(2,5);
        System.out.printf("Infinite series expansion with %d terms of exp(-%.2f\u00B2) = %f\n", n, x, result);

        System.out.println("===================== Test ======================");
        double nnn = 1.0- 4.0 + 16.0/2.0 - 64.0/6.0 + 256.0/24.0;
        System.out.println(nnn);
    }


}
