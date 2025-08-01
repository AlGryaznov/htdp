public class p_2_2_6 {

    public static double[] getScaleCoefs(double[] a) {

        double min = StdStats.min(a);
        double max = StdStats.max(a);
        double diff = max - min;

        double[] coefs;
        coefs = new double[a.length];

        for (int i = 0; i < coefs.length; i++) {

            coefs[i] = (a[i] - min) / diff;
        }

        return coefs;
    }


    public static double[] scale(double ymin, double ymax, double[] a) {

        double diff = ymax - ymin;
        double[] result = getScaleCoefs(a);

        for (int i = 0; i < result.length; i++) {
            result[i] = result[i] * diff + ymin;
        }

        return result;
    }


    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double ymin = Double.parseDouble(args[1]);
        double ymax = Double.parseDouble(args[2]);

        double[] a = new double[n];

        for (int i = 0; i < a.length; i++) {

            a[i] = StdRandom.uniformDouble(0,100);
        }

        StdArrayIO.print(a);

        StdArrayIO.print(scale(ymin, ymax, a));

    }
}
