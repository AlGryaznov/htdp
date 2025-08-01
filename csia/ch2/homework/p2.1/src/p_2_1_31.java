public class p_2_1_31 {

    public static double evaluate(double x, double[] p)
    {
        double sum = p[p.length - 1];

        for (int i = p.length - 2; i >= 0; i--) {

            sum = p[i] + x * sum;
        }
        return sum;
    }

    public static double exp(double x, int n)
    {
        double[] a = new double[n];

        a[0] = 1.0;
        for (int i = 1; i < n; i++) {

            a[i] = a[i-1] * (1.0 / i);
        }
        return evaluate(x, a);
    }

    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        StdOut.printf("Math.exp(%f) = %f\n", x, Math.exp(x));
        StdOut.printf("exp(%f) = %f\n", x, exp(x, n));
    }
}
