public class p_2_3_28 {


    final private static double[][] b = new double[200][200];

    private static long count = 0;

    public static double binomial(int n, int k)
    {
        count++;
        if ((n == 0) && (k == 0)) return 1.0;
        if ((n < 0) || (k < 0))   return 0.0;

        if (b[n][k + 1] == 0) {
            b[n][k + 1] = binomial(n - 1, k);
        }
        double left = b[n][k + 1];

        if (b[n][k] == 0)    {
            b[n][k] = binomial(n - 1, k - 1);
        }
        double right = b[n][k];

/*
        left = binomial(n - 1, k);
        right = binomial(n - 1, k - 1);
*/

        return (left + right) / 2.0;
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);



        System.out.println(binomial(n, k));
        System.out.println(count);
    }
}
