import edu.princeton.cs.algs4.StdOut;

public class p_2_1_28 {

    public static double pdf(double x)
    {
        return Math.exp(-x*x/2) /Math.sqrt(2* Math.PI);
    }

    public static double cdf(double z)
    {
        if (z < -8.0)  return 0.0;
        if (z > 8.0)  return 0.0;

        double sum = 0.0;
        double term = z;

        for (int i = 3; sum != sum + term; i += 2) {

            sum = sum + term;
            term = term * z * z / i;
        }
        return 0.5 + pdf(z) * sum;
    }

    public static double bsf(double x, double s, double r, double o, double t)
    {
        double ot = (o * Math.sqrt(t));
        double a = (Math.log(s/x) + (r + o*o/2) * t) / ot;
        double b = a - ot;

        return s * cdf(a) - x * Math.exp(-r * t) * cdf(b);
    }

    public static void main(String[] args)
    {
        double s = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double o = Double.parseDouble(args[2]);
        double t = Double.parseDouble(args[3]);

        StdOut.printf("%f\n", bsf(100.0, s, r, o, t));
    }
}
