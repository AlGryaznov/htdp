public class p_2_1_27 {

    public static double harmonicSmall(int n)
    {
        double sum = 0.0;
        //StdOut.printf("For n = %d\n", n);

        for (int i = 1; i <= n ; i++) {
            sum += 1.0/i;
            //StdOut.printf("i = %d, sum = %f\n", i,sum);
        }
        return sum;
    }

    public static double harmonicLarge(int n)
    {
        final double GAMMA = 0.577215664901532;
        double nn = n * n;
        return Math.log(n) + GAMMA + 1.0/(2 * n) - 1.0 / (12 * nn) + 1.0 / (120 * nn * nn);
    }

    public static double harmonic(int n)
    {
        double result = 0;
        if (n < 100) result = harmonicSmall(n);
        else         result = harmonicLarge(n);
        return result;
    }


    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {

            int arg = Integer.parseInt(args[i]);

            StdOut.printf("harmonicSmall value of number %d is %f\n", arg, harmonicSmall(arg));
            StdOut.printf("harmonicLarge value of number %d is %f\n", arg, harmonicLarge(arg));
            StdOut.printf("harmonic value of number %d is %f\n", arg, harmonicLarge(arg));
        }
    }
}
