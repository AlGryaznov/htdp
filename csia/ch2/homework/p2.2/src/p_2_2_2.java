public class p_2_2_2 {

    public static double sinh(double x) {
        return (Math.exp(x) - Math.exp(-x)) / 2.0;
    }

    public static double cosh(double x) {
        return (Math.exp(x) + Math.exp(-x)) / 2.0;
    }

    public static double tanh(double x) {
        return sinh(x) / cosh(x);
        // return (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
    }

    public static double coth(double x) {
        return cosh(x) / sinh(x);
        // return  (Math.exp(x) + Math.exp(-x)) / (Math.exp(x) - Math.exp(-x));
    }

    public static double sech(double x) {
        return 1.0 / cosh(x);
        // return 2.0 / (Math.exp(x) + Math.exp(-x));
    }

    public static double csch(double x) {
        return 1.0 / sinh(x);
        // return 2.0 / (Math.exp(x) - Math.exp(-x));
    }

    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);

        StdOut.printf("sinh(%.3f) = %.3f\n", x, sinh(x));
        StdOut.printf("cosh(%.3f) = %.3f\n", x, cosh(x));
        StdOut.printf("tanh(%.3f) = %.3f\n", x, tanh(x));
        StdOut.printf("coth(%.3f) = %.3f\n", x, coth(x));
        StdOut.printf("sech(%.3f) = %.3f\n", x, sech(x));
        StdOut.printf("csch(%.3f) = %.3f\n", x, csch(x));
    }
}
