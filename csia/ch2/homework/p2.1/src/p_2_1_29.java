public class p_2_1_29 {

    public static double peaksFourier(int n)
    {
        double t = 20.0 / n;
        double result = 0.0;

        for (int i = 1; i <= n; i++) {

            result += Math.cos(i * t - 10);
        }
        return result / n;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++) {

            int n = Integer.parseInt(args[i]);
            StdOut.printf("%.4f\n", peaksFourier(n));
        }
    }
}
