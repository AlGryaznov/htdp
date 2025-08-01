public class MyHarmonic {

    public static double harmonic(int n)
    {
        double sum = 0.0;
        StdOut.printf("For n = %d\n", n);

        for (int i = 1; i <= n ; i++) {
            sum += 1.0/i;
            StdOut.printf("i = %d, sum = %f\n", i,sum);
        }
        return sum;
    }

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {

            int arg = Integer.parseInt(args[i]);
            double value = harmonic(arg);
            StdOut.printf("harmonic value of number %d is %f\n", arg, value);
        }
    }
}