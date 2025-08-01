public class p_2_1_15 {

    public static double angleSubtend(double a1, double d1, double a2, double d2)
    {
        d1 = Math.toRadians(d1);
        d2 = Math.toRadians(d2);
        double sind2 = Math.sin(d2 - d1)/2;
        double sina2 = Math.sin(Math.toRadians(a2 - a1)/2);

        double result = 2 * Math.asin(Math.sqrt(
                    sind2 * sind2 + Math.cos(d1) * Math.cos(d2) * sina2 * sina2
                )
        );

        return Math.toDegrees(result);
    }

    public static void main(String[] args)
    {
        double a1 = Double.parseDouble(args[0]);
        double d1 = Double.parseDouble(args[1]);
        double a2 = Double.parseDouble(args[2]);
        double d2 = Double.parseDouble(args[3]);

        StdOut.printf("(a1, d1) = (%4.2f, %4.2f), (a2, d2) = (%4.2f, %4.2f)\n", a1, d1, a2, d2);
        StdOut.printf("angleSubtend = %4.7f\n", angleSubtend(a1, d1, a2, d2));
    }
}
