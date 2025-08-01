public class p_2_2_1 {

    public static double pdf(double x)
    {
        return Math.exp(-x*x/2) /Math.sqrt(2* Math.PI);
    }

    public static double pdf(double x, double mu, double sigma)
    {
        return pdf((x - mu)/sigma) / sigma;
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

    public static double cdf(double z, double mu, double sigma)
    {
        return cdf((z - mu) / sigma);
    }

    public static void main(String[] args) {
        double z = Double.parseDouble(args[0]);
        double mu = Double.parseDouble(args[1]);
        double sigma = Double.parseDouble(args[2]);
        StdOut.printf("cdf(double z) = %.3f\n", cdf((z - mu) / sigma));
        StdOut.printf("cdf(double z, double mu, double sigma) = %.3f\n", cdf(z, mu, sigma));
        StdOut.printf("pdf(double x) = %.3f\n", pdf((z - mu) / sigma));
        StdOut.printf("pdf(double x, double mu, double sigma) = %.3f\n", cdf(z, mu, sigma));
    }
}